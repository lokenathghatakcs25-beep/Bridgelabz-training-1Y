package LambdaExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
class Smart {
    private String identifier;
    private int brightness; // 0-100
    private String colorHex;
    private boolean active;
    public Smart(String identifier) {
        this.identifier = identifier;
        this.brightness = 0;
        this.colorHex = "#FFFFFF";
        this.active = false;
    }

    public void applySettings(int brightness, String colorHex) {
        this.active = brightness > 0;
        this.brightness = brightness;
        this.colorHex = colorHex;
        System.out.printf("  [%s] → %s | Brightness: %d%% | Color: %s%n",
                identifier, active ? "ON" : "OFF", brightness, colorHex);
    }

    public void turnOff() {
        applySettings(0, "#000000");
    }
}
class IlluminationController {
    private Map<String, Smart> lightRegistry = new HashMap<>();
    private Map<String, Consumer<Map<String, Smart>>> triggerBehaviors = new HashMap<>();
    public void registerLight(String id) {
        lightRegistry.put(id, new Smart(id));
    }

    // Bind any trigger name to a lambda behavior
    public void bindTrigger(String triggerName, Consumer<Map<String, Smart>> behavior) {
        triggerBehaviors.put(triggerName, behavior);
    }
    public void fire(String triggerName) {
        System.out.println("\n⚡ Trigger: [" + triggerName.toUpperCase() + "]");
        Consumer<Map<String, Smart>> behavior = triggerBehaviors.get(triggerName);
        if (behavior != null) {
            behavior.accept(lightRegistry);
        } else {
            System.out.println("  No behavior mapped for trigger: " + triggerName);
        }
    }

} class Shome{
    public static void main(String[] args) {
        IlluminationController controller = new IlluminationController();
        for (String zone : new String[]{"Entrance", "Hallway", "LivingRoom", "Kitchen", "Bedroom"}) {
            controller.registerLight(zone);
        }
        controller.bindTrigger("motion_entrance", lights -> {
            lights.get("Entrance").applySettings(90, "#FFE8C2");
            lights.get("Hallway").applySettings(60, "#FFF5E0");    // softer lead-in
        });

        controller.bindTrigger("time_night", lights -> {
            lights.values().forEach(l -> l.applySettings(15, "#FF6A00")); // dim amber
        });

        // ── Lambda 3: Morning routine (scheduled, e.g. 7 AM) ──────────────────
        controller.bindTrigger("time_morning", lights -> {
            lights.get("Bedroom").applySettings(40, "#FFF3CD");    // gentle wake-up
            lights.get("Kitchen").applySettings(85, "#FFFFFF");    // bright task light
            lights.get("Hallway").applySettings(55, "#F0F8FF");
        });
        controller.bindTrigger("voice_movie_mode", lights -> {
            lights.get("LivingRoom").applySettings(20, "#1A0050"); // deep violet accent
            lights.get("Hallway").applySettings(10, "#300030");    // near-off, moody
            lights.get("Kitchen").applySettings(5, "#200020");
            lights.get("Entrance").turnOff();
            lights.get("Bedroom").turnOff();
        });

        // ── Lambda 5: Voice command — "Full Brightness" ───────────────────────
        controller.bindTrigger("voice_full_bright", lights -> {
            lights.values().forEach(l -> l.applySettings(100, "#FFFFFF"));
        });
        controller.bindTrigger("alert_security", lights -> {
            lights.values().forEach(l -> l.applySettings(100, "#FF0000"));
            System.out.println("  ⚠ SECURITY ALERT: All zones set to maximum red!");
        });
        controller.bindTrigger("all_off", lights -> {
            lights.values().forEach(Smart::turnOff);
        });

        // ── Fire triggers to simulate real-world events ────────────────────────
        controller.fire("motion_entrance");
        controller.fire("time_morning");
        controller.fire("voice_movie_mode");
        controller.fire("alert_security");
        controller.fire("voice_full_bright");
        controller.fire("time_night");
        controller.fire("all_off");
    }
}
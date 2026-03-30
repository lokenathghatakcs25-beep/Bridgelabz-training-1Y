package AssingmentMultiThreading;
class D extends Thread {
    String n;
    int t;
    D(String n, int t) {
        this.n = n;
        this.t = t;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                long time = System.currentTimeMillis() / 1000;
                System.out.println(n + " | cycle " + i + " | time " + time);
                Thread.sleep(t * 1000);
            } catch (Exception e) {
                System.out.println("err");
            }
        }
    }
}
 public class A2 {
    public static void main(String[] args) {
        D temp = new D("Temp", 5);
        D cam = new D("Camera", 3);
        D light = new D("Light", 4);
        D door = new D("Door", 6);
        temp.setPriority(7);
        cam.setPriority(10);
        light.setPriority(5);
        door.setPriority(5);
        temp.start();
        cam.start();
        light.start();
        door.start();
        try {
            temp.join();
            cam.join();
            light.join();
            door.join();
        } catch (Exception e) {}
        System.out.println("All done");
    }
}
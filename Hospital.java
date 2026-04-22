import java.util.Arrays;
import java.util.List;

class Patient {
    private String patientId;
    private String name;
    private int age;
    private String ward;

    public Patient(String patientId, String name, int age, String ward) {
        this.patientId = patientId;
        this.name      = name;
        this.age       = age;
        this.ward      = ward;
    }

    public String getPatientId() { return patientId; }
    public String getName()      { return name; }
    public int    getAge()       { return age; }
    public String getWard()      { return ward; }

    public void printSummary() {
        System.out.printf("  ID: %-10s | Name: %-20s | Age: %3d | Ward: %s%n",
                patientId, name, age, ward);
    }

    public static void printId(Patient p) {
        System.out.println("  Patient ID: " + p.getPatientId());
    }
}

class AdminVerification {

    public static void printHeader(String title) {
        System.out.println("\n═════════════════════════════════════════╗");
        System.out.printf ("║  🏥 %-42s║%n", title);
        System.out.println("══════════════════════════════════════╝");
    }

    public static void verify(Patient p) {
        System.out.printf("  [VERIFIED] %-10s → %s%n", p.getPatientId(), p.getName());
    }
}

public class Hospital {

    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient("P-1001", "Aanya Sharma",    34, "Cardiology"),
                new Patient("P-1002", "Rohan Mehta",     52, "Neurology"),
                new Patient("P-1003", "Priya Iyer",      28, "Maternity"),
                new Patient("P-1004", "Karan Verma",     67, "Orthopedics"),
                new Patient("P-1005", "Sneha Kulkarni",  41, "Oncology"),
                new Patient("P-1006", "Arjun Nair",      19, "General"),
                new Patient("P-1007", "Meera Joshi",     73, "Geriatrics"),
                new Patient("P-1008", "Vikram Pandey",   45, "Cardiology")
        );

        AdminVerification.printHeader("Print All Patient IDs");
        patients.forEach(Patient::printId);

        AdminVerification.printHeader("Full Patient Summaries");
        patients.forEach(Patient::printSummary);

        AdminVerification.printHeader("Admin Verification Log");
        patients.forEach(AdminVerification::verify);

        AdminVerification.printHeader("Extracting IDs via Method Reference");
        patients.stream()
                .map(Patient::getPatientId)
                .forEach(System.out::println);
    }
}
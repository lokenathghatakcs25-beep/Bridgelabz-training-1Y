package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Doctor {
    private String doctorId;
    private String name;
    private String specialty;
    private boolean availableOnWeekends;
    private int experienceYears;
    private double consultationFee;

    public Doctor(String doctorId, String name, String specialty,
                  boolean availableOnWeekends, int experienceYears, double consultationFee) {
        this.doctorId             = doctorId;
        this.name                 = name;
        this.specialty            = specialty;
        this.availableOnWeekends  = availableOnWeekends;
        this.experienceYears      = experienceYears;
        this.consultationFee      = consultationFee;
    }

    public String  getDoctorId()            { return doctorId; }
    public String  getName()                { return name; }
    public String  getSpecialty()           { return specialty; }
    public boolean isAvailableOnWeekends()  { return availableOnWeekends; }
    public int     getExperienceYears()     { return experienceYears; }
    public double  getConsultationFee()     { return consultationFee; }

    public void printCard(int rank) {
        System.out.printf("  #%d  %-6s | %-25s | %-18s | Exp: %2d yrs | Fee: $%.2f | Weekend: %s%n",
                rank, doctorId, name, specialty, experienceYears,
                consultationFee, availableOnWeekends ? "✅" : "❌");
    }
}
public class Hospital{
    static void printHeader(String title) {
        System.out.println("\n╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.printf ("║  🏥 %-67s║%n", title);
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
    }

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("D-101", "Dr. Aryan Kapoor",    "Cardiology",      true,  15, 800.00),
                new Doctor("D-102", "Dr. Sneha Rao",       "Neurology",       false, 10, 950.00),
                new Doctor("D-103", "Dr. Vikram Nair",     "Orthopedics",     true,  8,  600.00),
                new Doctor("D-104", "Dr. Priya Menon",     "Cardiology",      false, 20, 1100.00),
                new Doctor("D-105", "Dr. Rohan Desai",     "Dermatology",     true,  5,  400.00),
                new Doctor("D-106", "Dr. Meera Iyer",      "Neurology",       true,  12, 900.00),
                new Doctor("D-107", "Dr. Karan Sharma",    "Oncology",        false, 18, 1200.00),
                new Doctor("D-108", "Dr. Ananya Singh",    "Pediatrics",      true,  7,  500.00),
                new Doctor("D-109", "Dr. Suresh Pillai",   "Orthopedics",     true,  22, 750.00),
                new Doctor("D-110", "Dr. Neha Gupta",      "Dermatology",     false, 3,  350.00),
                new Doctor("D-111", "Dr. Aditya Verma",    "Oncology",        true,  14, 1150.00),
                new Doctor("D-112", "Dr. Kavya Nambiar",   "Pediatrics",      false, 9,  480.00),
                new Doctor("D-113", "Dr. Rahul Joshi",     "General Surgery", true,  11, 650.00),
                new Doctor("D-114", "Dr. Divya Krishnan",  "Cardiology",      true,  6,  720.00),
                new Doctor("D-115", "Dr. Manish Tiwari",   "General Surgery", false, 17, 700.00)
        );

        printHeader("All Weekend-Available Doctors — Sorted by Specialty");
        List<Doctor> weekendBySpecialty = doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .collect(Collectors.toList());

        int rank = 1;
        for (Doctor d : weekendBySpecialty) d.printCard(rank++);

        printHeader("Weekend Doctors — Sorted by Experience (High to Low)");
        List<Doctor> weekendByExperience = doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .sorted(Comparator.comparingInt(Doctor::getExperienceYears).reversed())
                .collect(Collectors.toList());

        rank = 1;
        for (Doctor d : weekendByExperience) d.printCard(rank++);

        printHeader("Weekend Doctors — Affordable (Fee ≤ $750), Sorted by Fee");
        List<Doctor> weekendAffordable = doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .filter(d -> d.getConsultationFee() <= 750.00)
                .sorted(Comparator.comparingDouble(Doctor::getConsultationFee))
                .collect(Collectors.toList());

        rank = 1;
        for (Doctor d : weekendAffordable) d.printCard(rank++);

        printHeader("Weekend Doctors — Specialty then Fee (Multi-Level Sort)");
        List<Doctor> weekendMultiSort = doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .sorted(Comparator.comparing(Doctor::getSpecialty)
                        .thenComparingDouble(Doctor::getConsultationFee))
                .collect(Collectors.toList());

        rank = 1;
        for (Doctor d : weekendMultiSort) d.printCard(rank++);

        printHeader("Senior Weekend Doctors — Experience > 10 Years");
        List<Doctor> seniorWeekend = doctors.stream()
                .filter(Doctor::isAvailableOnWeekends)
                .filter(d -> d.getExperienceYears() > 10)
                .sorted(Comparator.comparing(Doctor::getSpecialty)
                        .thenComparingInt(Doctor::getExperienceYears).reversed())
                .collect(Collectors.toList());

        rank = 1;
        for (Doctor d : seniorWeekend) d.printCard(rank++);
    }
}
package level2;
import java.util.Scanner;
public class StudentReport {
        String n;   // name
        int r;      // roll number
        int m;      // marks
        StudentReport(String n, int r, int m) {
            this.n = n;
            this.r = r;
            this.m = m;
        }
        String grade() {
            if (m >= 90) return "A";
            else if (m >= 75) return "B";
            else if (m >= 60) return "C";
            else if (m >= 50) return "D";
            else return "F";
        }
        void show() {
            System.out.println("Name: " + n);
            System.out.println("Roll Number: " + r);
            System.out.println("Marks: " + m);
            System.out.println("Grade: " + grade());
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String n = s.nextLine();
            System.out.print("Enter Roll Number: ");
            int r = s.nextInt();
            System.out.print("Enter Marks: ");
            int m = s.nextInt();
            StudentReport st = new StudentReport(n, r, m);
            System.out.println("\nStudent Report:");
            st.show();
        }
    }
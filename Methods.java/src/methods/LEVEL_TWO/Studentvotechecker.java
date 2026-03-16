package methods.LEVEL_TWO;
import java.util.Scanner;
public class Studentvotechecker {
    public boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentvotechecker svc = new Studentvotechecker();
        int[] ages = new int[10];  // array to store 10 student ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            if (svc.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " can vote.");
            else
                System.out.println("Student " + (i + 1) + " cannot vote.");
        }
    }
}

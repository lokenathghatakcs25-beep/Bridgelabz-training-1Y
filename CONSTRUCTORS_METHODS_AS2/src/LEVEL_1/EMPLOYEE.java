package LEVEL_1;
import java.util.Scanner;
public class EMPLOYEE{
        String name;
        int id;
        double salary;
        public EMPLOYEE(String n, int i, double s) {
            name = n;
            id = i;
            salary = s;
        }
        public void display() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Salary: " + salary);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            EMPLOYEE emp = new EMPLOYEE(name, id, salary);
            System.out.println("\nEmployee Details:");
            emp.display();
            sc.close();
        }
    }


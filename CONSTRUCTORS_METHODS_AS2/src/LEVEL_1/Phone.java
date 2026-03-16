package LEVEL_1;
import java.util.Scanner;
public class Phone {
        String b;   // brand
        String m;   // model
        double p;   // price
        // constructor
        Phone(String b, String m, double p) {
            this.b = b;
            this.m = m;
            this.p = p;
        }
        // method to display details
        void show() {
            System.out.println("Brand: " + b);
            System.out.println("Model: " + m);
            System.out.println("Price: " + p);
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Brand: ");
            String b = s.nextLine();
            System.out.print("Enter Model: ");
            String m = s.nextLine();
            System.out.print("Enter Price: ");
            double p = s.nextDouble();
            Phone ph = new Phone(b, m, p);
            System.out.println("\nMobile Phone Details:");
            ph.show();
        }
    }

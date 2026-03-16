package methods.LEVEL_TWO;
import java.util.Scanner;
public class QUADRATICROOTS{
        // method to find roots
        static double[] root(double a, double b, double c) {
            double d = Math.pow(b, 2) - 4 * a * c;   // delta
            if (d > 0) {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                return new double[]{r1, r2};
            }
            else if (d == 0) {
                double r = (-b) / (2 * a);
                return new double[]{r};
            }
            else {
                return new double[]{}; // no real roots
            }
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = s.nextDouble();
            System.out.print("Enter b: ");
            double b = s.nextDouble();
            System.out.print("Enter c: ");
            double c = s.nextDouble();
            double[] r = root(a, b, c);
            if (r.length == 2)
                System.out.println("Roots: " + r[0] + " , " + r[1]);
            else if (r.length == 1)
                System.out.println("Root: " + r[0]);
            else
                System.out.println("No real roots");
        }
    }


package methods.LEVEL_ONE;
import java.util.Scanner;
    public class Last {
        public static double[] calc(double a) {
            double r = Math.toRadians(a); // convert degrees to radians
            return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter angle in degrees: ");
            double a = sc.nextDouble();
            double[] res = calc(a);
            System.out.println("Sine = " + res[0]);
            System.out.println("Cosine = " + res[1]);
            System.out.println("Tangent = " + res[2]);
        }
    }
//using inbuilt functions of sines cosines and tangent
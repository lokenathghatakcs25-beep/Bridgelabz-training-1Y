package methods.LEVEL_TWO;
import java.util.Scanner;
    public class BMI{
        public static void calcBMI(double[][] a) {
            for (int i = 0; i < a.length; i++) {
                double w = a[i][0];      // weight in kg
                double h = a[i][1] / 100; // height in meters
                a[i][2] = w / (h * h);   // BMI
            }
        }
        public static String status(double b) {
            if (b < 18.5) return "Underweight";
            else if (b < 25) return "Normal";
            else if (b < 30) return "Overweight";
            else return "Obese";
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] a = new double[10][3]; // 10 people: weight, height, BMI
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                a[i][0] = sc.nextDouble();
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                a[i][1] = sc.nextDouble();
            }
            calcBMI(a);
            double ref = 22.0;
            System.out.println("\nWt(kg)\tHt(cm)\tBMI\tStatus\tComparison");
            for (int i = 0; i < 10; i++) {
                double b = a[i][2];
                String s = status(b);
                String cmp = (b == ref) ? "Equal" : (b > ref ? "Greater" : "Less");
                System.out.printf("%.2f\t%.2f\t%.2f\t%s\t%s\n", a[i][0], a[i][1], b, s, cmp);
            }
        }
    }
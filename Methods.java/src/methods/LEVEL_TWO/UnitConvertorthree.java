package methods.LEVEL_TWO;
import java.util.Scanner;
public class UnitConvertorthree {
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double pToKg(double p) {
        return p * 0.453592;
    }
    public static double kgToP(double kg) {
        return kg * 2.20462;
    }
    public static double gToL(double g) {
        return g * 3.78541;
    }
    public static double lToG(double l) {
        return l * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + " F = " + fToC(f) + " C");
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + " C = " + cToF(c) + " F");
        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println(p + " lbs = " + pToKg(p) + " kg");
        System.out.print("Enter Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println(kg + " kg = " + kgToP(kg) + " lbs");
        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println(g + " gal = " + gToL(g) + " L");
        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println(l + " L = " + lToG(l) + " gal");
    }
}


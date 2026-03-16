package methods.LEVEL_TWO;
    import java.util.Scanner;
    public class Temperature {
        public static double calc(double t, double w) {
            return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(w, 0.16);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter temperature: ");
            double t = sc.nextDouble();
            System.out.print("Enter wind speed (mph): ");
            double w = sc.nextDouble();
            double chill = calc(t, w);
            System.out.println("Wind Chill Temperature = " + chill);
        }
    }


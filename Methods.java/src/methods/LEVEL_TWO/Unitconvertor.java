package methods.LEVEL_TWO;
public class Unitconvertor {
        public static double kmToMiles(double d) {
            return d * 0.621371;
        }
        public static double milesToKm(double d) {
            return d * 1.60934;
        }
        public static double metersToFeet(double d) {
            return d * 3.28084;
        }
        public static double feetToMeters(double d) {
            return d * 0.3048;
        }
        public static void main(String[] args) {
            System.out.println("5 km in miles = " + kmToMiles(5));
            System.out.println("3 miles in km = " + milesToKm(3));
            System.out.println("10 meters in feet = " + metersToFeet(10));
            System.out.println("20 feet in meters = " + feetToMeters(20));
        }
    }

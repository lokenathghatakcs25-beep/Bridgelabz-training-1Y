package methods.LEVEL_TWO;

public class UnitConvertortwo {
    public static double yToF(double d) {
        return d * 3;
    }
    public static double fToY(double d) {
        return d * 0.333333;
    }
    public static double mToI(double d) {
        return d * 39.3701;
    }
    public static double iToM(double d) {
        return d * 0.0254;
    }
    public static double iToCm(double d) {
        return d * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("5 yards in feet = " + yToF(5));
        System.out.println("9 feet in yards = " + fToY(9));
        System.out.println("2 meters in inches = " + mToI(2));
        System.out.println("10 inches in meters = " + iToM(10));
        System.out.println("15 inches in cm = " + iToCm(15));
    }
}


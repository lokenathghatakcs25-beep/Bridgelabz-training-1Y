package methods.LEVEL_ONE;
public class SpringSeason {
    static boolean check(int m, int d) {
        if ((m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20))
            return true;
        return false;
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter month and day");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        if (check(m, d))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

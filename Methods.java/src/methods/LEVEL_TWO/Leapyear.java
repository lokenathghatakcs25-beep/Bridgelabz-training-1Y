package methods.LEVEL_TWO;
import java.util.Scanner;
public class Leapyear {
        static boolean check(int y) {
            if (y < 1582)
                return false; // Gregorian calendar starts from 1582
            return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter year: ");
            int y = sc.nextInt();
            if (y < 1582)
                System.out.println("Leap year check valid only for year >= 1582.");
            else if (check(y))
                System.out.println(y + " is a Leap Year.");
            else
                System.out.println(y + " is Not a Leap Year.");
        }
    }

package methods.LEVEL_TWO;
    //Write a program to check whether a number is positive, negative, or zero.
      //      Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1
    //     for positive number and 0 if number is zero
 import java.util.*;
    public class Positive{
        static int check(int n) {
            if (n > 0)
                return 1;
            else if (n < 0)
                return -1;
            else
                return 0;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int r = check(n);
            if (r == 1)
                System.out.println("Positive number");
            else if (r == -1)
                System.out.println("Negative number");
            else
                System.out.println("Zero");
        }
    }














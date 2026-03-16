package methods.LEVEL_TWO;
//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers
//using loop
import java.util.Scanner;
    public class Sum{
        static int sum(int n) {
            int s = 0;
            for (int i = 1; i <= n; i++) {
                s = s + i;
            }
            return s;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int r = sum(n);
            System.out.println("Sum = " + r);
        }
    }


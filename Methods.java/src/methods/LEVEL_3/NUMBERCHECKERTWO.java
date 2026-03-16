package methods.LEVEL_3;
import java.util.Scanner;
public class NUMBERCHECKERTWO {
        static int cnt(int n) {
            int c = 0;
            while (n > 0) {
                c++;
                n /= 10;
            }
            return c;
        }
        static int[] dig(int n) {
            int c = cnt(n);
            int[] a = new int[c];
            for (int i = c - 1; i >= 0; i--) {
                a[i] = n % 10;
                n /= 10;
            }
            return a;
        }
        static int sum(int[] a) {
            int s = 0;
            for (int x : a)
                s += x;
            return s;
        }
        static int sqSum(int[] a) {
            int s = 0;
            for (int x : a)
                s += Math.pow(x, 2);
            return s;
        }
        static boolean harshad(int n, int[] a) {
            int s = sum(a);
            return n % s == 0;
        }
        static int[][] freq(int[] a) {
            int[][] f = new int[10][2];

            for (int i = 0; i < 10; i++)
                f[i][0] = i;

            for (int x : a)
                f[x][1]++;

            return f;
        }

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.print("Enter number: ");
            int n = s.nextInt();

            int c = cnt(n);
            int[] a = dig(n);

            System.out.println("Digit count = " + c);
            System.out.println("Sum of digits = " + sum(a));
            System.out.println("Sum of squares = " + sqSum(a));

            if (harshad(n, a))
                System.out.println("Harshad number");
            else
                System.out.println("Not Harshad number");

            int[][] f = freq(a);

            System.out.println("Digit Frequency:");
            for (int i = 0; i < f.length; i++)
                if (f[i][1] > 0)
                    System.out.println(f[i][0] + " -> " + f[i][1]);
        }
    }

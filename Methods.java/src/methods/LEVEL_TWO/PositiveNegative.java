package methods.LEVEL_TWO;
    import java.util.Scanner;
public class PositiveNegative {
        static boolean pos(int n) {
            return n >= 0;
        }
        static boolean even(int n) {
            return n % 2 == 0;
        }
        static int cmp(int a, int b) {
            if (a > b) return 1;
            else if (a == b) return 0;
            else return -1;
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.print("Enter number: ");
                a[i] = s.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                if (pos(a[i])) {
                    if (even(a[i]))
                        System.out.println(a[i] + " Positive Even");
                    else
                        System.out.println(a[i] + " Positive Odd");
                } else {
                    System.out.println(a[i] + " Negative");
                }
            }
            int r = cmp(a[0], a[4]);
            if (r == 1)
                System.out.println("First number is greater");
            else if (r == 0)
                System.out.println("First and Last numbers are equal");
            else
                System.out.println("First number is less");
        }
    }

package methods.LEVEL_3;
import java.util.*;
public class NUMBERCHECKERTHREE {
        public static int countDigits(int n) {
            return String.valueOf(Math.abs(n)).length();
        }
        public static int[] digitsArray(int n) {
            String s = String.valueOf(Math.abs(n));
            int[] d = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                d[i] = s.charAt(i) - '0';
            }
            return d;
        }
        public static int[] reverseArray(int[] d) {
            int[] r = new int[d.length];
            for (int i = 0; i < d.length; i++) {
                r[i] = d[d.length - 1 - i];
            }
            return r;
        }
        public static boolean compareArrays(int[] a, int[] b) {
            return Arrays.equals(a, b);
        }
        public static boolean isPalindrome(int n) {
            int[] d = digitsArray(n);
            int[] r = reverseArray(d);
            return compareArrays(d, r);
        }
        public static boolean isDuck(int n) {
            int[] d = digitsArray(n);
            for (int digit : d) {
                if (digit != 0) return true;
            }
            return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Digit count: " + countDigits(num));
            int[] d = digitsArray(num);
            System.out.print("Digits array: ");
            for (int x : d) System.out.print(x + " ");
            System.out.println();
            int[] rev = reverseArray(d);
            System.out.print("Reversed array: ");
            for (int x : rev) System.out.print(x + " ");
            System.out.println();
            System.out.println("Is palindrome? " + isPalindrome(num));
            System.out.println("Is duck number? " + isDuck(num));
            sc.close();
        }
    }


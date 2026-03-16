package methods.LEVEL_3;

import java.util.Scanner;
public class NUMBERCHECKER {
    public static int cnt(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
    public static int[] dig(int n) {
        int c = cnt(n);
        int[] a = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            a[i] = n % 10;
            n /= 10;
        }
        return a;
    }
    public static boolean duck(int[] a) {
        for (int x : a)
            if (x == 0)
                return true;
        return false;
    }
    public static boolean arm(int n, int[] a) {
        int p = a.length;
        int s = 0;

        for (int x : a)
            s += Math.pow(x, p);
        return s == n;
    }
    public static int[] large(int[] a) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > m1) {
                m2 = m1;
                m1 = x;
            } else if (x > m2 && x != m1) {
                m2 = x;
            }
        }
        return new int[]{m1, m2};
    }
    public static int[] small(int[] a) {
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        for (int x : a) {
            if (x < m1) {
                m2 = m1;
                m1 = x;
            } else if (x < m2 && x != m1) {
                m2 = x;
            }
        }
        return new int[]{m1, m2};
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        int c = cnt(n);
        int[] a = dig(n);
        System.out.println("Digit count = " + c);
        System.out.print("Digits: ");
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("Duck number = " + duck(a));
        System.out.println("Armstrong number = " + arm(n, a));
        int[] l = large(a);
        System.out.println("Largest = " + l[0] + " Second Largest = " + l[1]);
        int[] sm = small(a);
        System.out.println("Smallest = " + sm[0] + " Second Smallest = " + sm[1]);
    }
}
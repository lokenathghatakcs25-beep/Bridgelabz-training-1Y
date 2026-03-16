package methods.LEVEL_3;
import java.util.Scanner;
public class FACTORS{
    static int[] fac(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        int[] a = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                a[k++] = i;
        return a;
    }
    static int max(int[] a) {
        int m = a[0];
        for (int x : a)
            if (x > m)
                m = x;
        return m;
    }

    static int sum(int[] a) {
        int s = 0;
        for (int x : a)
            s += x;
        return s;
    }
    static long prod(int[] a) {
        long p = 1;
        for (int x : a)
            p *= x;
        return p;
    }
    static double cubeProd(int[] a) {
        double p = 1;
        for (int x : a)
            p *= Math.pow(x, 3);
        return p;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        int[] a = fac(n);
        System.out.print("Factors: ");
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("Greatest factor = " + max(a));
        System.out.println("Sum = " + sum(a));
        System.out.println("Product = " + prod(a));
        System.out.println("Product of cubes = " + cubeProd(a));
    }
}
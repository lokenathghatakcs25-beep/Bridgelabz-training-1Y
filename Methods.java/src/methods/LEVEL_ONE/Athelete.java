package methods.LEVEL_ONE;

import java.util.Scanner;

public class Athelete {
    public static void Perimeter(int s1,int s2,int s3){
        double per=s1+s2+s3;
        double dis=5000;
        double result=dis/per;
        System.out.println("result ="+result);
    }
    public static void main(String[] args){
        Perimeter(12, 13,15);
    }

    public static class Youngest {
        static int young(int[] a) {
            int m = 0;
            for (int i = 1; i < 3; i++) {
                if (a[i] < a[m])
                    m = i;
            }
            return m;
        }
        static int tall(double[] h) {
            int m = 0;
            for (int i = 1; i < 3; i++) {
                if (h[i] > h[m])
                    m = i;
            }
            return m;
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String[] n = {"Amar", "Akbar", "Anthony"};
            int[] a = new int[3];        // ages
            double[] h = new double[3];  // heights
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + n[i] + ": ");
                a[i] = s.nextInt();
                System.out.print("Enter height of " + n[i] + ": ");
                h[i] = s.nextDouble();
            }
            int y = young(a);
            int t = tall(h);
            System.out.println("Youngest friend: " + n[y]);
            System.out.println("Tallest friend: " + n[t]);
        }
    }

    public static class Chocolates {
        static void divide(int n, int m) {
            int perChild = n / m;   // chocolates each child gets
            int rem = n % m;        // remaining chocolates
            System.out.println("Each child gets: " + perChild + " chocolates");
            System.out.println("Remaining chocolates: " + rem);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter total chocolates: ");
            int n = sc.nextInt();
            System.out.print("Enter number of children: ");
            int m = sc.nextInt();
            divide(n, m);
        }
    }
}

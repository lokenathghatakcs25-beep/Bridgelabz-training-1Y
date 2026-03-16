package methods.LEVEL_TWO;
    import java.util.Scanner;
public class SmallestLargest {
        static void find(int a, int b, int c) {
            int small = a;
            int large = a;
            if (b < small)
                small = b;
            if (c < small)
                small = c;
            if (b > large)
                large = b;
            if (c > large)
                large = c;
            System.out.println("Smallest = " + small);
            System.out.println("Largest = " + large);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 3 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            find(a, b, c);
            sc.close();
        }
    }


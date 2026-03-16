package methods.LEVEL_TWO;
import java.util.Scanner;
class SumNaturalnos {
    static int sumLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Enter a natural number (>0).");
        } else {
            int sum1 = sumLoop(n);
            int sum2 = sumFormula(n);
            System.out.println("Sum using loop = " + sum1);
            System.out.println("Sum using formula = " + sum2);
            if (sum1 == sum2)
                System.out.println("Both results are equal.");
            else
                System.out.println("Results do not match.");
        }
    }
}
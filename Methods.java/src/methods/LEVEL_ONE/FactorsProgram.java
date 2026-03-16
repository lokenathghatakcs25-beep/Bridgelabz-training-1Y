package methods.LEVEL_ONE;

import java.util.Scanner;
    public class FactorsProgram{
        // Method to find factors and return array
        static int[] findFactors(int n) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    factors[index++] = i;
            }
            return factors;
        }
        // Method to find sum of factors
        static int sum(int[] arr) {
            int s = 0;
            for (int x : arr)
                s += x;
            return s;
        }
        static int sumSquares(int[] arr) {
            int s = 0;
            for (int x : arr)
                s += Math.pow(x, 2);
            return s;
        }
        static int product(int[] arr) {
            int p = 1;
            for (int x : arr)
                p *= x;
            return p;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int[] factors = findFactors(n);
            System.out.print("Factors: ");
            for (int f : factors)
                System.out.print(f + " ");
            System.out.println();
            System.out.println("Sum of factors = " + sum(factors));
            System.out.println("Sum of squares of factors = " + sumSquares(factors));
            System.out.println("Product of factors = " + product(factors));
        }
    }

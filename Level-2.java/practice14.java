package com.gla.Array;
import java.util.*;
public class practice14 {
    public class ArraySum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] numbers = new double[10];
            double total = 0.0;
            int index = 0;
            while (true) {
                System.out.print("Enter number: ");
                double num = sc.nextDouble();
                if (num <= 0) {
                    break;
                }
                if (index == 10) {
                    System.out.println("Reached maximum of 10 numbers.");
                    break;
                }
                numbers[index] = num;
                index++;
            }
            System.out.println("\nNumbers entered:");
            for (int i = 0; i < index; i++) {
                System.out.println(numbers[i]);
                total += numbers[i];
            }
            System.out.println("Sum of numbers: " + total);
        }
    }
}

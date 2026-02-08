package com.gla.Array;
import java.util.Scanner;
public class practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = n * (i + 1);
            System.out.println(n + " * " + (i + 1) + " = " + arr[i]);
        }
    }
}



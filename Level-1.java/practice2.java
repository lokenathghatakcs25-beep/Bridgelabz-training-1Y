package com.gla.Array;

import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = sc.nextInt();
        }
        int h = n;
        int[] arr = new int[h];
        for (int i = 0; i < h; i++) {
            arr[i] = sc.nextInt();
        }
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < age[y]) {
                y = i;
            }
        }
        int th = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[th]) {
                th=i;
            }
        }

        System.out.println("Youngest friend is " +
                " with age " + age[y]);

        System.out.println("Tallest friend is " +
                " with height " + arr[th]);
    }}

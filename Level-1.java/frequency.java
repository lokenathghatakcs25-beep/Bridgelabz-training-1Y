package com.gla.Array;
import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int[] arr = new int[count];
        temp = n;
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }
        int[] freq = new int[count];
        int visit = -1;
        for (int i = 0; i < count; i++) {
            if (freq[i] == visit) {
                continue;
            }
            int free = 1; // count current digit
            for (int j = i + 1; j < count; j++) {
                if (arr[i] == arr[j]) {
                    free++;
                    freq[j] = visit; // mark as visited
                }
            }
            freq[i] = free;
        }
        for (int i = 0; i < count; i++) {
            if (freq[i] != visit) {
                System.out.println("Frequency of " + arr[i] + " is = " + freq[i]);
            }
        }
    }
}

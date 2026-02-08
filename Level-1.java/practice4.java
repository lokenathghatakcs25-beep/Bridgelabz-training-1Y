package com.gla.Array;
import java.util.*;
public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int count = 0;
        while (n != 0) {
            int sum = n % 10;
             n= n / 10;
            count++;
        }
        int reverse=0;
       int[] darr=new  int[count];
        for(int i=count-1;i>=0;i--){
            darr[i]=temp%10;
            temp=temp/10;
        }
        for (int i=count-1;i>=0;i--){
            System.out.print(darr[i]+", ");
        }
    }
}
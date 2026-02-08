package com.gla.Array;
import java.util.*;
public class practice11 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]>=18){
                    System.out.println("student with age " +arr[i]+ " can vote");
                }
                if(arr[i]<0){
                    System.out.println("Invalid input");
                }
            }
        }
    }


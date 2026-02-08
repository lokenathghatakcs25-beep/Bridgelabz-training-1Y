package com.gla.Array;
import java.util.*;
public class Practice6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] harr=new double[n];
        double[] war=new double[n];
        double[] bmi=new double[n];
        for(int i=0;i<n;i++){
             harr[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            war[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            bmi[i]=war[i]/(harr[i]*harr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(  bmi[i]);
            if(bmi[i]<=18.4){
                System.out.println(bmi[i]+"=underweight");
            }
            else if(bmi[i]>=18.5&&bmi[i]<=24.9){
                System.out.println(bmi[i]+"=normal");
            }
            else if(bmi[i]>25.0&&bmi[i]<39.9){
                System.out.println(bmi[i]+"=Overweight");
            }
            else{
                System.out.println(bmi+"=obese");
            }
        }
        System.out.println(sc.next());

    }
}

package com.gla.Array;
import java.util.*;
public class Practice8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sub=sc.nextInt();
        int[] chem=new int[sub];
        int[] phy=new int[sub];
        int[] mt=new int[sub];
        double[] res=new double[sub];
        for(int i=0;i<sub;i++){
            chem[i]=sc.nextInt();
        }
        for(int i=0;i<sub;i++){
            phy[i]=sc.nextInt();
        }
        for(int i=0;i<sub;i++){
            mt[i]=sc.nextInt();
        }
        for(int i=0;i<sub;i++){
            res[i]=(chem[i]+phy[i]+mt[i])*100.0/300;
        }
        System.out.println("the required result");
        for(int i=0;i<sub;i++){
            if( res[i]>=80) {
                System.out.println(res[i]+"above agency noramlized");
            }
            else if( res[i]>=70&&res[i]<=79){
                System.out.println("at above normalised");
            }
            else if(res[i]>=60&&res[i]<=69){
                System.out.println("below but approaching normalised students"+res[i]);
            }
         else if(res[i]>=50&&res[i]<=59){
             System.out.println("well below normalised students==="+res[i]);
            }
         else if(res[i]>=40&&res[i]<=49) {
             System.out.println("too below normalised students=="+res[i]);
            }
         else{
             System.out.println("Remedial students"+res[i]);
            }
        }
    }
}

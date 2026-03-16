package methods.LEVEL_ONE;

import java.util.Scanner;

public class Circle{
    public static void Area(int r){
        double area=Math.PI*(r*r);
        System.out.println("area of a circle==="+area);
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
     Area(r);
    }
}

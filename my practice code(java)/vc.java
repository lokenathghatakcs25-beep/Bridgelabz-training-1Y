import java.util.*;
public class vc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double r= sc.nextDouble();
double h=sc.nextDouble();
double r2=r*r;
double vc=r2*h*Math.PI;
System.out.print("volume of a cylinder"+vc);
}
}

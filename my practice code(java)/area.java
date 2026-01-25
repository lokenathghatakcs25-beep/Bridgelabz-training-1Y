import java.util.*;
public class area{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double h=sc.nextDouble();
double b=sc.nextDouble();
double area=(1.0/2.0)*h*b;
double areai=area/6.45;
double areaf=area/929.08;
System.out.println("your height in cm is\t"+h);
System.out.println("while in feet is\t"+areaf);
System.out.println("while in inches is "+areai);
}
}

 
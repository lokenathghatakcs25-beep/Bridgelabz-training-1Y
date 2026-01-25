import java.util.*;
public class converteryards{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double distinfeet=sc.nextDouble();
double Y=distinfeet/3;
double M=Y/1760;
System.out.println("Yards:"Y);
System.out.println("Miles"+M);
}
}
import java.util.*;
public class trianglefind{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a==b)&&(b==c)&&(c==a)){
System.out.println("Equilateral triangle");
else if((a!=b)&&(b==c)&&(c==a)){
System.out.println("Isoceles triangle");
}
else{
System.out.println("Scalene triangle");
}
}
}

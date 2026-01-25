import java.util.*;
public class relationaloperator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c= a+b;
int d =sc.nextInt();
if(c==d){
System.out.println("");
}
else if(c!=d){
System.out.println("they are not equal");
}
else if(c>=d){
System.out.println("c is greater than equal d");
}
else if(c<=d){
System.out.println("c is lesser than equal to d");
}
}
}
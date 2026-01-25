import java.util.*;
public class unaryoperator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
a++;
System.out.println("post increment operator "+a);
++a;
System.out.println("pre increment operator"+a);
--b;
System.out.println("pre decrement operator"+b);
b--;
System.out.println("post decrement operator"+b);
}
}

import java.util.*;
public class sumdigits{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int q=n;
int a=0;
int sum=0;
while(q!=0){
a=q%10;
sum=sum+a;
q=q/10;
}
System.out.println("sum of a no in a digit="+sum);
}
}

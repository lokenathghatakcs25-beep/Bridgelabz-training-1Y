import java.util.*;
public class sumfor{
public static void main(String[] main){
Scanner sc=new Scanner(System.in);
int sum=0;
int n=sc.nextInt();
for(int i=0;i<=n;i++){
sum=sum+i;
}
int sumn=(n*(n+1))/2;
System.out.println("the formulated sum is"+sumn);
System.out.println("sum of n natural nos="+sum);
}
}

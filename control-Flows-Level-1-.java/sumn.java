import java.util.*;
public class sumn{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0;
int sum=0;
while(n!=0&&i<=n){
sum=sum+i;
i++;
}
int sumw=((n*(n+1)/2));
System.out.println("formulated sum=="+sumw);
System.out.println("sum of n natural nos"+sum);
}
}

	
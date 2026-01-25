import java.util.*;
public class sumzero{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int i=0;
while(n!=0){
sum=sum+n;
i++;
}
System.out.println("sum"+sum);
}
}

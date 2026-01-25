import java.util.*;
public class sssum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double n=sc.nextDouble();
double sum=0;
while(n!=0){
sum=sum+n;
n=sc.nextDouble();
}
System.out.println("the required value="+sum);
}
}


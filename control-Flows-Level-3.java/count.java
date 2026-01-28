import java.util.*;
public class count{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int p=n;
int a;
int sum=0;
int count=0;
while(p!=0){
a=p%10;
sum=sum+a;
p=p/10;
count++;
}
System.out.println("count="+count);
}
}



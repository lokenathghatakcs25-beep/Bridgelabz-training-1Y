import java.util.*;
public class armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int p=n;
int sum=0;
int a=0;
while(p!=0){
a=p%10;
sum=sum+(a*a*a);
p=p/10;
}
if(n==sum){
System.out.println("armstrong number");
}
else{
System.out.println("not a armstrong number");
}
}
}

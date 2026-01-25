import java.util.*;
public class reverseno{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int q=n;
int sum=0;
int a=0;
int reverse=0;
while(q!=0){
a=q%10;
reverse=reverse*10+a;
q=q/10;
}
System.out.println("reverse of a no="reverse);
}
}





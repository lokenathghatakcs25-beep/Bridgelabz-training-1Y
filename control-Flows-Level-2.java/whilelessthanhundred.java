import java.util.*;
public class whilelessthanhundred{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=n-1;
if(n>0&&n<100){
while(count>=1){
if(n%count==0){
System.out.println("the factors are"+count);
}
count--;
}
}
}
}

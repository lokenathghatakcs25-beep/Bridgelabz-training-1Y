import java.util.*;
public class greatest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=a-1;
for(int i=count;i<=1;i++){
if(count%i==0){
System.out.println("the greatest factor:"+count);
}
}
}
}

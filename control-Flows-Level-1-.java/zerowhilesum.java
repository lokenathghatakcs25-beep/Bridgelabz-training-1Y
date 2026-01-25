import java.util.*;
public class zerowhilesum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
while(n>0){
if(n==0){
break;
}
else{
sum=sum+n;
}
n=sc.nextInt();
}
System.out.println("the required sum"+sum);
}
}

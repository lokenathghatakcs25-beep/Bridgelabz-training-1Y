import java.util.*;
public class greatest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int greatestfactor=1;
for(int i=a-1;i>=1;i--){
if(a%i==0){
greatestfactor =i;
break;
}
}
System.out.println("the factor:"+greatestfactor);
}
}

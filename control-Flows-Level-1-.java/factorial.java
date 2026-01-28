//factorial
import java.util.*;
public class factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i=0;
int n=sc.nextInt();
int fact=1;
for(i=1;i<=n;i++){
	fact=fact*i;
}
System.out.println("factorial of a number="+fact);
}
}

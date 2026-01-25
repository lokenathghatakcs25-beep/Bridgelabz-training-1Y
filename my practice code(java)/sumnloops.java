import java.util.*;
public class sumnloops{ 
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int i=0;
int sum=0;
while(i<=n){
sum=sum+i;
i++;
}
System.out.println("the sum is "+sum);
}
}

import java.util.*;
public class amstrong{
public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b,sum=0;
b=a;
while(b!=0){
 b=b%10;
 sum=(b*b*b)+sum;
 b=b/10;
 }
 if(sum==a){
 System.out.println("amstrong no ");
 }else{
 System.out.println("Not amstrong no");
 }
 }
 }
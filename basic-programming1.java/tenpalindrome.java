import java.util.*;
public class tenpalindrome{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int sum=0,rev=0,b;
b=a;
while(b!=0){
sum=b%10;
rev=rev*10+sum;
b=b/10;
}
if(rev==a){
System.out.println("palindrome no");
}
else{
System.out.println("Not palindrome no");
}
}
}

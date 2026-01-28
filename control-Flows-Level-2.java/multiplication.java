import java.util.*;
public class multiplication{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0){
for(int i=6;i<=9;i++){
	int result=i*n;
   System.out.println(n+"*"+i+"="+result);
   }
}
else{
	System.out.println("enter a positive integer");
   }
}
   }
   
import java.util.*;
public class lessthanhundred{
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
if(n>=1&&n<=100){
for(i=100;i>=n;i--){
	if(i%n==0){
		System.out.println("The multiples are"+i);
	}
}
}
	}
}

import java .util.*;
public class Divisiblebyfive{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%5==0||n%10==0){
System.out.println("Divisible by 5");
}
else{
System.out.println("Not divisible by 5");
}
}
}

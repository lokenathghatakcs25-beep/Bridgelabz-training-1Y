import java.util.*;
public class fizzbuzz{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0){
for(int i=1;i<=n;i++){
if(i%3==0&&i%5==0){
System.out.println("the fizz no is "+i);
}
else if(i%5==0){
System.out.println("the buzz no is "+i);
}
else if(i%3==0){
System.out.println("the nos is fizzbuzz "+i);
}
else{
System.out.println("the no is "+i);
}
}
}
}
}

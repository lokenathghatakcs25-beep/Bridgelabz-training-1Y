import java.util.*;
public class whilefactor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
if(n>0){
while(i<n){
if(n%i==0){
System.out.println("the factors of a no are"+i);
i++;
}
}
}
}
}

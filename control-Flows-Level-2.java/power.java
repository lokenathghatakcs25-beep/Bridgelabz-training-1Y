import java.util.*;
public class power{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int result=1;
if(m>0&&n>0){
for(int i=1;i<=m;i++){
result=result*n;
}
System.out.println("the power is="+result);
}
}
}

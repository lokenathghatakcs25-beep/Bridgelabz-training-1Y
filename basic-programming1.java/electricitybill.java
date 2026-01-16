import java.util.*;
class electricitybill{
public static void main(String args[]){ 
Scanner sc=new Scanner(System.in);
int u=sc.nextInt();
float bill;
if(u>=1&&u<=100){
bill=10*u;
}
else if(u>100&&u<=200){
bill=1000+(u-100)*15;
}
else if(u>200&&u<=300){
bill=1000+1500+(u-200)*20;
}
else{
	bill= 1000+1500+2000+(u-300)*25;
}
System.out.println("bill:"+bill);
}
}

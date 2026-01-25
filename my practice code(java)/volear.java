import java.util.*;
public class volear{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
double ree=r*r*r;
double pi=3.14;
double vol;
vol=(4.0/3.0)*ree*pi;
vkm=(1000*1000*1000);
double volkmm= vol/vkm;
double volmile=vkm/0.2399;
System.out.println("volume:"+volkmm);
System.out.println("volume in mile:"+volmile);
}
}

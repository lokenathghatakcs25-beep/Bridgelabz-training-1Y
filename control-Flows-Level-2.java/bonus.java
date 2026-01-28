import java.util.*;
public class salary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double salary=sc.nextDouble();
double years=sc.nextDouble();
if(years>=5){
double bonus =5;
bonus=bonus/100*salary;
salary=salary+bonus;
System.out.println("total salary with bonus="+salary);
}
else{
System.out.println("No bonus");
}
}
}

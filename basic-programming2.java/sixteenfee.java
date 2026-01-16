import java.util.*;
public class sixteenfee{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double fee=sc.nextDouble();
double disp=sc.nextDouble();
double discnt=fee*(disp/100);
double dfee=fee-discnt;
System.out.println("fee:"+dfee);
}
}

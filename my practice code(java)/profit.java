import java.util.*;
public class profit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double cp=sc.nextDouble();
double sp=sc.nextDouble();
double profit=sp-cp;
double pp=(profit/cp)*100;
System.out.println("profit"+profit);
System.out.println("pp"+pp);
}
}

import java.util.*;
public class subjects{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double phy=sc.nextDouble();
double chem=sc.nextDouble();
double maths=sc.nextDouble();
double pp=((phy+chem+maths)/300)*100;
System.out.println("the required percentage="+pp);
if(pp>=80){
	System.out.println("above agency-normalised standard");
}else if(pp>=70&&pp<=79){
	System.out.println("at agency-normalized standards");
}
else if(pp>=60&&pp<=69){
	System.out.println("below,but approaching-agency normalised standards");
}
else if(pp>=50&&pp<=59){
	System.out.println("well below agency-normalized standards");
}
else if(pp>=40&&pp<=49){
	System.out.println("too below agency-normalized standards");
}
else{
	System.out.println("Remedial standards");
}
}
}


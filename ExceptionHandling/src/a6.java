/*6. throw vs. throws (Exception Propagation)
💡 Problem Statement:
Create a method calculateInterest(double amount, double rate, int
years) that:
● Throws IllegalArgumentException if amount or rate is negative.
● Propagates the exception using throws and handles it in main().
Expected Behavior:
● If valid, return and print the calculated interest.
● If invalid, catch and display "Invalid input: Amount and rate must be
positive".
*/
import java.util.*;
class SI {
 public static Double CalculateInteresT(double p, double r, double t)  {
     double result;
     if(r<0|| t<0) throw new IllegalArgumentException("rate and time must be in positive");
     else {
        result = (p * r * t) / 100;
     }
         return result;

    }
}
public class a6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double res=0;
        try {
            Double p = sc.nextDouble();
            Double r = sc.nextDouble();
            Double t = sc.nextDouble();
             res = SI.CalculateInteresT(p, r, t);
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
        System.out.println(res);
    }
}

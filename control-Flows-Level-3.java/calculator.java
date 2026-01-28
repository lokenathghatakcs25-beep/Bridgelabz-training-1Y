import java.util.*;
public class SwitchCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
double a = sc.nextDouble();
System.out.println("Enter second number:");
double b = sc.nextDouble();
System.out.println("Choose an operator (+, -, *, /):");
char op = sc.next().charAt(0);
switch (op) {
case '+':
System.out.println("Result = " + (a + b));
break;
case '-':
System.out.println("Result = " + (a - b));
break;
case '*':
System.out.println("Result = " + (a * b));
break;
case '/':
if (b != 0) {
System.out.println("Result = " + (a / b));
} else {
System.out.println("Division by zero is not allowed");
}
break;
default:
System.out.println("Invalid operator");
  }
 }
}

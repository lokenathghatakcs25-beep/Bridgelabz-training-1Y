import java.util.InputMismatchException;

/*2. Unchecked Exception (Runtime Exception)
💡 Problem Statement:
Write a Java program that asks the user to enter two numbers and divides them. Handle
possible exceptions such as:
● ArithmeticException if division by zero occurs.
● InputMismatchException if the user enters a non-numeric value.
*/
import java.util.*;
class a2 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception found");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch Exception found");
        }
    }
}
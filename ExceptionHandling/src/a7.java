/*  7. finally Block Execution
💡 Problem Statement:
Write a program that performs integer division and demonstrates the finally block
execution.
● The program should:
○ Take two integers from the user.
○ Perform division.
○ Handle ArithmeticException (if dividing by zero).
○ Ensure "Operation completed" is always printed using finally.
*/
import java.util.*;
 class a7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result=a/b;
        }catch(ArithmeticException e){
            System.out.println("arithmetic Exception found");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}

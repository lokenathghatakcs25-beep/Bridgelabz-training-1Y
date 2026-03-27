/*9. Nested try-catch Block
💡 Problem Statement:
Write a Java program that:
● Takes an array and a divisor as input.
● Tries to access an element at an index.
● Tries to divide that element by the divisor.
● Uses nested try-catch to handle:
○ ArrayIndexOutOfBoundsException if the index is invalid.
○ ArithmeticException if the divisor is zero.
*/
import java.util.*;
class a9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arr=new int[m];
        int i=0;
        for(i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int a=0;
        int result=0;
        int result2=0;
        try{ result=arr[8];
            result2=arr[4]/a; }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception found");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound Exception");
        }
    }
}

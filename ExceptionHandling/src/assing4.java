/*4. Multiple Catch Blocks
💡 Problem Statement:
Create a Java program that performs array operations.
        ● Accept an integer array and an index number.
        ● Retrieve and print the value at that index.
        2
        ● Handle the following exceptions:
        ○ ArrayIndexOutOfBoundsException if the index is out of range.
        ○ NullPointerException if the array is null.
 */
import java.util.*;
public class assing4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        String[] narr = new String[m];
        for (int i = 0; i < m; i++) {
            narr[i] = sc.next();
        }
        narr[0] = null;

        String result1 = null;
        try {
            result = arr[8];
            result1 = narr[0];
            System.out.println(result1.length());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(result);
            System.out.println("IndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println(result1);
            System.out.println("NullPointerException");
        }
    }
}
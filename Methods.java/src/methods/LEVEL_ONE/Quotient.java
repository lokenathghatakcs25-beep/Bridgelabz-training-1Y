package methods.LEVEL_ONE;
    import java.util.Scanner;
    public class Quotient{
        static void divide(int a, int b) {
            int q = a / b;  // quotient
            int r = a % b;  // remainder
            System.out.println("Quotient = " + q);
            System.out.println("Remainder = " + r);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 2 numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            divide(num1, num2);  // call the method
        }
    }


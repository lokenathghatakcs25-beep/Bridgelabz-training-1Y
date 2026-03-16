package level2;

import java.util.Scanner;
class BankAccount {
    String n;      // account holder name
    long acc;      // account number
    double b;      // balance

    public BankAccount(String n, long acc, double b) {
        this.n = n;
        this.acc = acc;
        this.b = b;
    }

    public void dep(double amt) {
        b += amt;
        System.out.println("Deposited: " + amt);
    }

    public void wit(double amt) {
        if (amt <= b) {
            b -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void disp() {
        System.out.println("Balance: " + b);
    }
}
public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Acc No: ");
        long acc = sc.nextLong();
        System.out.print("Initial Balance: ");
        double b = sc.nextDouble();
        BankAccount a = new BankAccount(n, acc, b);
        int ch;
        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.print("Amount: ");
                    a.dep(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    a.wit(sc.nextDouble());
                    break;
                case 3:
                    a.disp();
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid!");
            }
        } while(ch != 4);
        sc.close();
    }
}
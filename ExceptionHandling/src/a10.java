import java.util.Scanner;

/*10. Bank Transaction System (Checked + Custom
Exception)
💡 Problem Statement:
Develop a Bank Account System where:
● withdraw(double amount) method:
○ Throws InsufficientBalanceException if withdrawal amount
exceeds balance.
○ Throws IllegalArgumentException if the amount is negative.
● Handle exceptions in main().
Expected Behavior:
● If valid, print "Withdrawal successful, new balance: X".
● If balance is insufficient, throw and handle "Insufficient balance!".
● If the amount is negative, throw and handle "Invalid amount!".
*/
// Checked exception for insufficient balance
import java.util.Scanner;

// Custom checked exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account class
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }
}
public class a10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
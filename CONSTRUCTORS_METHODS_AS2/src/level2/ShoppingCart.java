package level2;
import java.util.ArrayList;
import java.util.Scanner;
class CartItem {
    String n;
    double p;
    int q;
    public CartItem(String n, double p, int q) {
        this.n = n;
        this.p = p;
        this.q = q;
    }
    public double total() {
        return p * q;
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        int ch;
        do {
            System.out.println("\n1. Add Item 2. Remove Item 3. Total Cost 4. Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // consume newline
            switch(ch) {
                case 1: // Add item
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    cart.add(new CartItem(name, price, qty));
                    System.out.println("Item added.");
                    break;

                case 2: // Remove item
                    System.out.print("Enter index to remove (starting from 0): ");
                    int idx = sc.nextInt();
                    if(idx >= 0 && idx < cart.size()) {
                        cart.remove(idx);
                        System.out.println("Item removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("Items in cart:");
                    for(int i=0; i<cart.size(); i++) {
                        CartItem c = cart.get(i);
                        System.out.println(i + ". " + c.n + " x" + c.q + " = " + c.total());
                        total += c.total();
                    }
                    System.out.println("Total Cost: " + total);
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(ch != 4);
        sc.close();
    }
}
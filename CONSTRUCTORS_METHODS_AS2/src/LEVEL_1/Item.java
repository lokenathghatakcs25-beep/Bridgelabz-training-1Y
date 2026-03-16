package LEVEL_1;
import java.util.Scanner;
public class Item {
    int c;        // itemCode
    String n;     // itemName
    double p;     // price
    Item(int c, String n, double p) {
        this.c = c;
        this.n = n;
        this.p = p;
    }
    void show() {
        System.out.println("Item Code: " + c);
        System.out.println("Item Name: " + n);
        System.out.println("Price: " + p);
    }
    double cost(int q) {
        return p * q;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter item code: ");
        int c = s.nextInt();
        s.nextLine();
        System.out.print("Enter item name: ");
        String n = s.nextLine();
        System.out.print("Enter price: ");
        double p = s.nextDouble();
        Item i = new Item(c, n, p);
        System.out.print("Enter quantity: ");
        int q = s.nextInt();
        i.show();
        System.out.println("Total Cost = " + i.cost(q));
    }
}

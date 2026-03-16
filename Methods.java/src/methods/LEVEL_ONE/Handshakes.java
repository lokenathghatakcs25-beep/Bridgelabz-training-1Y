package methods.LEVEL_ONE;

import java.util.Scanner;
class Handshake {
    static int hs(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students: ");
        int n = sc.nextInt();
        int h = hs(n);
        System.out.println("Handshakes = " + h);
    }
}
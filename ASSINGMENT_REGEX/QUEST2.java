package ASSINGMENT_REGEX;
import java.util.*;
public class QUEST2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String plate = sc.nextLine();
        String regex = "^[A-Z]{2}[0-9]{4}";
        if (plate.matches(regex)) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }
    }
}
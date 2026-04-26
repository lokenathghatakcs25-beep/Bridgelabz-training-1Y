package ASSINGMENT_REGEX;
import java.util.regex.*;
public class QUEST15 {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Valid SSN found: " + matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println("No valid SSN found");
        }
    }
}
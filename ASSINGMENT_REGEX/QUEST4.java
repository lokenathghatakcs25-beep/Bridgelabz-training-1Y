package ASSINGMENT_REGEX;
import java.util.regex.*;
public class QUEST4 {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
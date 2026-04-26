package ASSINGMENT_REGEX;
import java.util.regex.*;
import java.util.*;
public class QUEST_LANG {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group());
        }
        System.out.println(String.join(", ", result));
    }
}
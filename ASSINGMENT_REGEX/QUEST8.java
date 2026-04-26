package ASSINGMENT_REGEX;
public class QUEST8 {
    public static void main(String[] args) {
        String input = "This   is   an   example   with   multiple   spaces.";
        String result = input.replaceAll(" {2,}", " ");
        System.out.println("Original: " + input);
        System.out.println("Updated : " + result);
    }
}
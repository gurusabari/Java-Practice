package string;
//Write a method to check if a substring exists within a string.
public class SubstringExample1 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String sub = "World";

        System.out.println(isSubstring(s, sub));
    }
    public static boolean isSubstring(String s, String sub) {
        return s.contains(sub); // Checks if 'sub' exists in 's'
    }
}

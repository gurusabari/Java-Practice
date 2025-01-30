package string;

public class StringLiterals {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        // Check if str1 and str2 reference the same object
        System.out.println("Are str1 and str2 the same object? " + (str1 == str2));
    }

}

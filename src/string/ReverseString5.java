package string;

public class ReverseString5 {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverse(str);
        System.out.println("Reversed String: " + reversed);
    }

}

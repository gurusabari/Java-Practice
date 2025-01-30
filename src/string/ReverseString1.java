package string;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }

}

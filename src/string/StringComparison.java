package string;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Using == operator (compares references)
        boolean result1 = (str1 == str2);
        System.out.println("Using == : " + result1);

        // Using equals() method (compares content)
        boolean result2 = str1.equals(str2);
        System.out.println("Using equals() : " + result2);
    }
}

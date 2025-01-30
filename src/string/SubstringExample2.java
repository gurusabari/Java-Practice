package string;

public class SubstringExample2 {
    public static int countOccurrences(String s, String sub) {
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello, World! World!";
        String sub = "World";
        System.out.println(countOccurrences(s, sub)); // Output: 2
    }
}

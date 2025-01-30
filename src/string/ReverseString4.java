package string;

import java.util.stream.Collectors;

public class ReverseString4 {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = new StringBuilder(str)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        lst -> {
                            java.util.Collections.reverse(lst);
                            return lst.stream();
                        }
                ))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Reversed String: " + reversed);
    }

}

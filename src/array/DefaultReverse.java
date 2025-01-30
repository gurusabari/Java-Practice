package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultReverse {
    public static void main(String[] args) {
        DefaultReverse obj = new DefaultReverse();
        int[] inputArray = {2, 3, 4};
        obj.revArray(inputArray);
    }

    public void revArray(int[] inputArray) {
        // Convert int[] to Integer[] because Collections.reverse() doesn't work on primitive types
        List<Integer> list = Arrays.stream(inputArray)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(list);

        // Convert back to int[]
        int[] reversedArray = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Reversed Array (Collections.reverse()): " + Arrays.toString(reversedArray));
    }
}

package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] inputArray = {2, 3, 4};
        obj.reverseArray(inputArray);
    }

    // Method with an input parameter
    public void reverseArray(int[] inputArray) {
        int n = inputArray.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[n - 1 - i];
            inputArray[n - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(inputArray));
    }
}

package array;

import java.util.Arrays;

public class SeperateLoops {
    public static void main(String[] args) {
        SeperateLoops obj = new SeperateLoops();
        obj.reverseArray();
    }

    public void reverseArray() {
        int[] inputArray = {2, 3, 4};
        int n = inputArray.length;

        // First loop: Copy elements before swapping
        for (int i = 0; i < n / 2; i++) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[n - 1 - i];
            inputArray[n - 1 - i] = temp;
        }

        // Second loop: Iterating through array (this is not needed for reversal but done as per the request)
        for (int i = 0; i < n; i++) {

        }

        System.out.println("Reversed Array: " + Arrays.toString(inputArray));
    }
}

package array;

import java.util.Arrays;
import java.util.Collections;


public class ArrayBasics {
    int[] arr = {1,2,3};
    int[][] arr1 = {
            {1,2},
            {3,4}
    };
    public static void main(String[] args){
        ArrayBasics obj = new ArrayBasics();
        obj.reverseArray();
    }

    public void reverseArray(){
        int[] inputArray = {2,3,4} ;
        int n = inputArray.length;
        for (int i = 0,j = n-1;i<j;i++,j--) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
        }
        System.out.println("Reverse Array" + Arrays.toString(inputArray));

    }
    public void revArray(){
        int[] inputArray = {2,3,4} ;
        Collections.reverse(Arrays.asList(inputArray));
        System.out.println("Reverse Array" + Arrays.toString(inputArray));
    }
}

/*
1.Break the line.18 into 2 for loop
2.convert our method into input parameter ...
3.reverse default method ,
 */


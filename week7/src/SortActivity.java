import java.util.Arrays;

import static java.lang.Math.round;

public class SortActivity {
    public static void main(String[] args) {
        // Accepting array input
        int[] array = {5, 2, 7, 3, 9, 8};

        // call Merge Sort algorithm
        mergeSort(array);

        // print sorted array
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array){
        // base case is if the array has 0 or 1 elements is already sorted
        int length = array.length;
        if(length <= 1){
            return;
        }
        // the logic of the algorithm
            // 1. find middle of array
        int middleIndex = length / 2;

            // 2. create left and right sub-arrays
            // 3. share data between the arrays
            // 4. recursive code to sort the sub-arrays
            // 5. merge sorted arrays all together
    }
}

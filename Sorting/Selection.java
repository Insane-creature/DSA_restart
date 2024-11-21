// It repeatedly selects the minimum element from the unsorted part of the array and 
// swaps it with the first unsorted element.

package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int []arr = {3,4,5,2,8};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}

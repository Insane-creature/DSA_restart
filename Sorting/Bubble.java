// It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. 
// The process is repeated until the list is sorted.

// Time Complexity: O(n²)
// Space Complexity: O(1)

package Sorting;

public class Bubble {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        
        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            bubbleSort(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}
    
package Other;

import java.util.Arrays;

public class pritingArrayMethods {
    public static void main(String[] args) {
        int []arr = {3,4,5,2,8};
        // System.out.println(arr);

        // Using Array.toString()
        System.out.println(Arrays.toString(arr));

        // Using loops
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Using Java Streams
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}

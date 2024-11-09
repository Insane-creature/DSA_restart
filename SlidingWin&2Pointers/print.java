public class print {

    public static void main(String[] args) {
        System.out.println("hellos");
    }
}

// import java.util.Arrays;
    

// public class MaxCardPoints {
//     public static void main(String[] args) {
//         int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
//         int k = 4;  // Number of cards to choose

//         Result result = maxPointsFromCards(arr, k);
//         System.out.println("Maximum points: " + result.maxPoints);
//         System.out.println("Cards contributing to max points: " + Arrays.toString(result.cards));
//     }

//     public static Result maxPointsFromCards(int[] arr, int k) {
//         int n = arr.length;
//         int maxPoints = 0;
//         int[] chosenCards = new int[k]; // Array to hold chosen cards

//         // Check for all possible combinations of choosing cards
//         for (int i = 0; i <= k; i++) {
//             // i cards from the front and (k - i) cards from the back
//             int frontSum = sum(arr, 0, i - 1); // Sum of the first i cards from front
//             int backSum = sum(arr, n - (k - i), n - 1); // Sum of the last (k - i) cards from back

//             // Calculate total points
//             int totalPoints = frontSum + backSum;

//             // Update max points and chosen cards if we found a new maximum
//             if (totalPoints > maxPoints) {
//                 maxPoints = totalPoints;
//                 // Copy the chosen cards into the result array
//                 int index = 0;
//                 // Adding cards from the front
//                 for (int j = 0; j < i; j++) {
//                     chosenCards[index++] = arr[j];
//                 }
//                 // Adding cards from the back
//                 for (int j = n - (k - i); j < n; j++) {
//                     chosenCards[index++] = arr[j];
//                 }
//             }
//         }

//         return new Result(maxPoints, chosenCards);
//     }

//     // Helper function to calculate the sum of elements in the specified range
//     private static int sum(int[] arr, int start, int end) {
//         if (start < 0 || end >= arr.length || start > end) {
//             return 0; // Return 0 if the range is invalid
//         }
//         int total = 0;
//         for (int i = start; i <= end; i++) {
//             total += arr[i];
//         }
//         return total;
//     }
// }

// // Class to hold the result of max points and corresponding cards
// class Result {
//     int maxPoints;
//     int[] cards;

//     Result(int maxPoints, int[] cards) {
//         this.maxPoints = maxPoints;
//         this.cards = cards;
//     }
// }

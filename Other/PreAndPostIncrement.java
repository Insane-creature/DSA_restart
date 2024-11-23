package Other;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        int i = 5;

        // Pre-Increment
        System.out.println("Value of i Before Pre-Increment: " + i); // Output: 5
        int preResult = ++i; // i is incremented to 6, then assigned to preResult
        System.out.println("Pre-Increment Result: " + preResult); // Output: 6
        System.out.println("Value of i after Pre-Increment: " + i); // Output: 6

        i = 5; // Reset i for example

        // Post-Increment
        System.out.println("Value of i Before Pre-Increment: " + i); // Output: 5
        int postResult = i++; // i is assigned to postResult, then incremented to 6
        System.out.println("Post-Increment Result: " + postResult); // Output: 5
        System.out.println("Value of i after Post-Increment: " + i); // Output: 6
    }

}

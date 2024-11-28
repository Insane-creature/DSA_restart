package Strings.Intermediate;

public class compresing {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        // Handle empty or single character strings
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Iterate through the string
        for (int i = 1; i < str.length(); i++) {
            // Check if the current character is the same as the previous one
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // Increment the count for the current character
            } else {
                // Append the character and its count to the compressed string
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1; // Reset the count for the next character
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1)).append(count);

        // Return the compressed string if it's shorter; otherwise, return the original
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
    
    
}

package Strings.Intermediate;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "cadbzabcd";
        HashSet<Character> charSet = new HashSet<>();
        int left = 0; // Start of the sliding window
        int max_len = 0;
        int start = 0; // Start index of the longest substring

        for (int right = 0; right < str.length(); right++) {
            // If duplicate is found, shrink the window from the left
            while (charSet.contains(str.charAt(right))) {
                charSet.remove(str.charAt(left));
                left++;
            }

            // Add the current character to the set
            charSet.add(str.charAt(right));

            // Update the maximum length and starting index of the substring
            max_len = Math.max(max_len, right - left + 1);

        }
        System.out.println(str.substring(start, start + max_len));

    }
}

package Strings.Intermediate;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry);
            // if (entry.getValue() == 1) {
            //     System.out.println("First non-repeating character: " + entry.getKey());
            //     return;
            // }
        }

        // System.out.println("No non-repeating character found.");

    }
}

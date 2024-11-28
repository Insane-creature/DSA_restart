package Strings.Intermediate;

import java.util.HashMap;
import java.util.Map;

public class duplicate {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);    
        }

        System.out.println("Duplicate characters are:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}

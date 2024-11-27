package Strings;

import java.util.HashMap;
import java.util.Map;

public class findCharacterCount {
    public static void main(String[] args) {
        String str = "hello";

        Map<Character, Integer> charFrequency = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        System.out.println(charFrequency);
    }
}

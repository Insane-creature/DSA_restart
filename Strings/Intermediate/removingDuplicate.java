package Strings.Intermediate;

import java.util.HashMap;
import java.util.Map;

public class removingDuplicate {
    public static void main(String[] args) {
        String str = "programming";     // progamin
        StringBuilder newstr = new StringBuilder();
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);    
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (newstr.indexOf(String.valueOf(ch)) == -1) {
                newstr.append(ch);
            }
        }
        System.out.println(newstr.toString());


        

    }
}

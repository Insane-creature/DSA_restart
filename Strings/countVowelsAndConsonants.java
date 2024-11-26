package Strings;

public class countVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "hello";
        String vowels = "";
        int count_vowels = 0, count_consonents = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) count_vowels += 1;
            else count_consonents += 1;
        }
        System.out.println("Vowels: "+count_vowels+" Cosonents: "+count_consonents);
    }
}

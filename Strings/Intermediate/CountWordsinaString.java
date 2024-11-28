package Strings.Intermediate;

public class CountWordsinaString {
    public static void main(String[] args) {
        String str = "Count Words in a String";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch)){
                count+=1;    
            }
        }
        System.out.println(count+1);
    }
}

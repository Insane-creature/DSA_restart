
package Strings.Basic;

public class removingWhiteSpaces {
    public static void main(String[] args) {
        String str = "I am Anshika";
        System.out.println(str);
        String newStrin = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
               newStrin += ch;
            }
            
            
        }
        System.out.println(newStrin);

    }
}
package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Mom";
        StringBuilder reversedString  = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        
        if(str.equalsIgnoreCase(reversedString.toString())){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}

package Strings;

public class Reversing_Recusrsion {
    public static void main(String[] args) {
        String str = "I am working";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}


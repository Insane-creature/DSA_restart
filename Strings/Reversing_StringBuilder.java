package Strings;

public class Reversing_StringBuilder {
    public static void main(String[] args) {
        int a = 10;
        String str = "I am String";
        StringBuilder reverse = new StringBuilder(str);

        // Data typeqz
        System.out.println(reverse.reverse().toString());
        System.out.println("Data type of a: " + ((Object) a).getClass().getName());

    }
}

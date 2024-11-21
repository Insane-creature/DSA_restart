package Other;

public class DataType {
    public static void main(String[] args) {
        int a = 10;
        String reverse = "Anshika";
        StringBuilder str = new StringBuilder(reverse);
        // Data typeqz
        System.out.println(str.reverse().toString());
        System.out.println("Data type of a: " + ((Object) a).getClass().getName());
    }
}

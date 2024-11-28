package Strings.Intermediate;

public class checkRotation {
    public static boolean checkingRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        } 
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DABC";
        boolean isRotated = checkingRotation(s1, s2);
        System.out.println(checkingRotation(s1, s2));
    }
}

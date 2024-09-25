class Solution {
    public boolean isPalindrome(String s) {
        char ch;
        String str = "";

        String str1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i < str1.length();i++){
            ch = str1.charAt(i);
            str = ch+str;
        }

        if(str.equalsIgnoreCase(str1)){
            return true;
        }
        else{
            return false;
        }
    }
}

package Tencent;

public class Tencent_3 {

    private String res = "";

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        for (int i = 0; i < s.length(); i++){
            isPalindrome(s, i, i);
            isPalindrome(s, i, i+1);
        }
        return res;
    }

    private void isPalindrome(String s, int i, int j){
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        String sub = s.substring(i+1, j);
        res = sub.length() > res.length() ? sub : res;
    }
}

package Tencent;

public class Tencent_49 {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) return;
        int i = 0, j = s.length-1;
        while (i < j){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}

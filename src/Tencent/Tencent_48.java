package Tencent;

public class Tencent_48 {
    public void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while (i < j){
            swap(s, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] s, int x, int y){
        char c = s[x];
        s[x] = s[y];
        s[y] = c;
    }
}

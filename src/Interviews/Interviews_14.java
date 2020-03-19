package Interviews;

public class Interviews_14 {
    public int longestPalindrome(String s) {
        int[] cs = new int[128];
        for (char c : s.toCharArray()) {
            cs[c]++;
        }
        int ans = 0;
        for (int n : cs) {
            ans += n / 2 * 2;
            if (n % 2 == 1 && ans % 2 == 0) ans++;
        }
        return ans;
    }
}

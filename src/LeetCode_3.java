public class LeetCode_3 {
    public int lengthOfLongestSubstring(String s){
        if (s == null || s.length() == 0) return 0;
        int[] index = new int[128];
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i++){
            j = Math.max(index[s.charAt(i)], j);
            res = Math.max(res, i - j + 1);
            index[s.charAt(i)] = i+1;
        }
        return res;
    }
}

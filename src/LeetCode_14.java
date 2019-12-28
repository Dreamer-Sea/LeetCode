public class LeetCode_14 {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        int minLen = strs[0].length();
        for (int i = 1; i < strs.length; i++){
            if (minLen > strs[i].length())
                minLen = strs[i].length();
        }
        int low = 1, high = minLen;
        while (low <= high){
            int mid = (low + high) >> 1;
            if (isCommonPrefix(strs, mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return strs[0].substring(0, (low + high) >> 1);
    }

    private boolean isCommonPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++){
            if (!strs[i].startsWith(str1)) return false;
        }
        return true;
    }
}

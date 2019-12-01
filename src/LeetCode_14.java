public class LeetCode_14 {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs){
            minLen = Math.min(minLen, str.length());
        }

        int low = 1, high = minLen;
        while (low <= high){
            int mid = (low + high) >> 1;
            if (isCommomPrefix(strs, mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return strs[0].substring(0, (low + high) >> 1);
    }

    private boolean isCommomPrefix(String[] strs, int len){
        String str1 = strs[0].substring(0, len);
        for (String str : strs){
            if (!str.startsWith(str1)) return false;
        }
        return true;
    }
}

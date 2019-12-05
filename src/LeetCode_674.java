public class LeetCode_674 {

    public static void main(String[] args) {
        LeetCode_674 p = new LeetCode_674();
        System.out.println(p.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    public int findLengthOfLCIS(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int res = 0, idx = 0;
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i-1] >= nums[i]) idx = i;
            res = Math.max(res, i - idx + 1);
        }
        return res;
    }
}

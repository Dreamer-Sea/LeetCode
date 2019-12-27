public class LeetCode_674 {

    public static void main(String[] args) {
        LeetCode_674 p = new LeetCode_674();
        p.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
    }

    public int findLengthOfLCIS(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int count = 1, max = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i-1]) count++;
            else count = 1;
            if (max < count) max = count;
        }
        return max;
    }
}

public class LeetCode_53 {

    public static void main(String[] args) {
        LeetCode_53 p = new LeetCode_53();
        p.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }

    public int maxSubArray(int[] nums){
        if (nums.length == 0) return 0;
        int max = nums[0], tmp = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (tmp + nums[i] < nums[i]) tmp = 0;
            tmp += nums[i];
            if (max < tmp) max = tmp;
        }
        return max;
    }
}

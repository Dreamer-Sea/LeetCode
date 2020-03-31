package TargetOffer;

public class Interviews_59_1 {

    public static void main(String[] args) {
        maxSlidingWindow(new int[]{}, 0);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k) return new int[0];
        int[] res = new int[nums.length - k + 1];
        int max;
        for (int i = 0; i < res.length; i++){
            max = nums[i];
            for (int j = i; j < i + k; j++){
                if (max < nums[j]) max = nums[j];
            }
            res[i] = max;
        }
        return res;
    }
}

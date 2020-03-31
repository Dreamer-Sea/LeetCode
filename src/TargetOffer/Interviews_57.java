package TargetOffer;

public class Interviews_57 {

    public static void main(String[] args) {
        twoSum(new int[] {2, 7, 11, 15}, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[0];
        int[] res = new int[2];
        int i = 0, j = nums.length - 1;
        while (i < j){
            int sum = nums[i] + nums[j];
            if (sum == target){
                res[0] = nums[i];
                res[1] = nums[j];
                break;
            }else if (sum > target) j--;
            else i++;
        }
        return res;
    }
}

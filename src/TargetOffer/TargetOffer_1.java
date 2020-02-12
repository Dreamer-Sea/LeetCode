package TargetOffer;

public class TargetOffer_1 {
    public boolean Find(int target, int[][] nums) {
        if (nums == null || nums.length == 0) return false;
        int rows = nums.length, cols = nums[0].length, i = rows-1, j = 0;
        while (i >= 0 && j < cols){
            if (nums[i][j] == target) return true;
            if (nums[i][j] > target) i--;
            else j++;
        }
        return false;
    }
}

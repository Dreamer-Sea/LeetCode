public class TargetOffer_1 {
    public boolean Find(int target, int[][] nums){
        if (nums.length == 0 || nums[0].length == 0) return false;
        int row = nums.length-1, col = 0;
        while (row >= 0 && col < nums[0].length){
            if (target == nums[row][col]) return true;
            if (target > nums[row][col]) col++;
            else row--;
        }
        return false;
    }
}

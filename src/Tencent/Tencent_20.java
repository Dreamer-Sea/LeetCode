package Tencent;

public class Tencent_20 {
    public int[][] generateMatrix(int n) {
        if (n < 1) return null;
        int[][] nums = new int[n][n];
        int count = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++) {
                nums[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++){
                nums[i][right] = count++;
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--)
                    nums[bottom][i] = count++;
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--)
                    nums[i][left] = count++;
                left++;
            }
        }
        return nums;
    }
}

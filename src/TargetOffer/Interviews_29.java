package TargetOffer;

public class Interviews_29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[]{};
        int[] res = new int[matrix.length * matrix[0].length];
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int k = 0;
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++){
                res[k++] = matrix[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++){
                res[k++] = matrix[i][right];
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    res[k++] = matrix[bottom][i];
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    res[k++] = matrix[i][left];
                }
                left++;
            }
        }
        return res;
    }
}

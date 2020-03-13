package Tencent;

public class Tencent_20 {

    public static void main(String[] args) {
        generateMatrix(3);
    }

    public static int[][] generateMatrix(int n) {
        if (n < 1) return null;
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1, count = 1;
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++){
                matrix[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++){
                matrix[i][right] = count++;
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    matrix[i][left] = count++;
                }
                left++;
            }
        }
        return matrix;
    }
}

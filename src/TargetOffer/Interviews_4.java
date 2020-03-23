package TargetOffer;

public class Interviews_4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length){
            if (matrix[i][j] == target) return true;
            if (matrix[i][j] < target) j++;
            else i--;
        }
        return false;
    }
}

public class TargetOffer_65 {
    public static void main(String[] args) {
        hasPath("ABCESFCSADEE".toCharArray(), 3, 4, "SEE".toCharArray());
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0 || rows * cols != matrix.length || matrix.length < str.length) return false;
        boolean[] marked = new boolean[rows * cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (backtracking(matrix, rows, cols, str, i, j, 0, marked))
                    return true;
            }
        }
        return false;
    }

    private static boolean backtracking(char[] matrix, int rows, int cols, char[] str, int row, int col, int idx, boolean[] marked){
        boolean flag = false;
        if (col < 0 || col >= cols || row < 0 || row >= rows) return false;
        int i = row * cols + col;
        if (col >= 0 && col < cols && row >= 0 && row < rows && !marked[i] && matrix[i] == str[idx]){
            marked[i] = true;
            idx++;
            if (idx == str.length) return true;
            flag = backtracking(matrix, rows, cols, str, row+1, col, idx, marked)
                    || backtracking(matrix, rows, cols, str, row-1, col, idx, marked)
                    || backtracking(matrix, rows, cols, str, row, col+1, idx, marked)
                    || backtracking(matrix, rows, cols, str, row, col-1, idx, marked);
            if (!flag){
                idx--;
                marked[i] = false;
            }
        }
        return flag;
    }
}

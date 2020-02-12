public class TargetOffer_65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if (matrix == null || matrix.length == 0 || matrix.length != rows * cols || str == null || str.length == 0 || str.length > matrix.length)
            return false;
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (backtracking(matrix, rows, cols, str, i, j, 0, visited)) return true;
            }
        }
        return false;
    }

    private boolean backtracking(char[] matrix, int rows, int cols, char[] str, int row, int col, int idx, boolean[] visited){
        if (row < 0 || row >= rows || col < 0 || col >= cols) return false;
        boolean flag = false;
        int i = cols * row + col;
        if (!visited[i] && matrix[i] == str[idx]){
            visited[i] = true;
            idx++;
            if (idx == str.length) return true;
            flag = backtracking(matrix, rows, cols, str, row+1, col, idx, visited)
                    || backtracking(matrix, rows, cols, str, row-1, col, idx, visited)
                    || backtracking(matrix, rows, cols, str, row, col+1, idx, visited)
                    || backtracking(matrix, rows, cols, str, row, col-1, idx, visited);
            if (!flag){
                idx--;
                visited[i] = false;
            }
        }
        return flag;
    }
}

package TargetOffer;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class TargetOffer_65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || str == null || rows * cols != matrix.length || str.length > matrix.length) return false;
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (hasPath(matrix, rows, cols, str, i, j, 0, visited)) return true;
            }
        }
        return false;
    }

    private boolean hasPath(char[] matrix, int rows, int cols, char[] str, int row, int col, int idx, boolean[] visited){
        if (row < 0 || row >= rows || col < 0 || col >= cols || idx >= str.length) return false;
        int i = row * cols + col;
        boolean flag = false;
        if (!visited[i] && matrix[i] == str[idx]){
            visited[i] = true;
            idx++;
            if (idx == str.length) return true;
            flag = hasPath(matrix, rows, cols, str, row+1, col, idx, visited)
                    || hasPath(matrix, rows, cols, str, row-1, col, idx, visited)
                    || hasPath(matrix, rows, cols, str, row, col+1, idx, visited)
                    || hasPath(matrix, rows, cols, str, row, col-1, idx, visited);
            if (!flag){
                visited[i] = false;
                idx--;
            }
        }
        return flag;
    }
}

public class TargetOffer_66 {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows < 1 || cols < 1) return 0;
        boolean[] visited = new boolean[rows * cols];
        return backtracking(threshold, rows, cols, 0, 0, visited);
    }

    private int backtracking(int threshold, int rows, int cols, int row, int col, boolean[] visited){
        if (col < 0 || col >= cols || row < 0 || row >= rows) return 0;
        int i = cols * row + col;
        if (visited[i] || !isValid(row, col, threshold)) return 0;
        visited[i] = true;
        return backtracking(threshold, rows, cols, row+1, col, visited)
                + backtracking(threshold, rows, cols, row-1, col, visited)
                + backtracking(threshold, rows, cols, row, col+1, visited)
                + backtracking(threshold, rows, cols, row, col-1, visited) + 1;
    }

    private boolean isValid(int x, int y, int threshold){
        int res = 0;
        while (x != 0){
            res += x % 10;
            x /= 10;
        }
        while (y != 0){
            res += y % 10;
            y /= 10;
        }
        if (res > threshold) return false;
        return true;
    }
}

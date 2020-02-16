package TargetOffer;

public class TargetOffer_66 {
    public int movingCount(int threshold, int rows, int cols) {
        if (rows < 1 || cols < 1 || threshold < 1) return 0;
        boolean[] visited = new boolean[rows * cols];
        return backtracking(threshold, rows, cols, 0, 0, visited);
    }

    private int backtracking(int threshold, int rows, int cols, int row, int col, boolean[] visited){
        if (row < 0 || row >= rows || col < 0 || col >= cols) return 0;
        int i = row * cols + col;
        if (visited[i] || !isValid(threshold, row, col)) return 0;
        visited[i] = true;
        return backtracking(threshold, rows, cols, row+1, col, visited)
                + backtracking(threshold, rows, cols, row-1, col, visited)
                + backtracking(threshold, rows, cols, row, col+1, visited)
                + backtracking(threshold, rows, cols, row, col-1, visited) + 1;
    }

    private boolean isValid(int threshold, int x, int y){
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x /= 10;
        }
        while (y != 0){
            sum += y % 10;
            y /= 10;
        }
        if (sum > threshold) return false;
        return true;
    }
}

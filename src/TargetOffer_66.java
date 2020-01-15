public class TargetOffer_66 {

    public static void main(String[] args) {
        movingCount(18, 10, 10);
    }

    public static int movingCount(int threshold, int rows, int cols){
        if (threshold < 0 || rows < 1 || cols < 1) return 0;
        int[] count = new int[1];
        boolean[] marked = new boolean[rows * cols];
        return backtracking(threshold, rows, cols, marked, 0, 0);
    }

    private static int backtracking(int threshold, int rows, int cols, boolean[] marked, int x, int y){
        if (x < 0 || x >= rows || y < 0 || y >= cols) return 0;
        int i = x * cols + y;
        if (marked[i] || !isValid(threshold, x, y)) return 0;
        marked[i] = true;
        return 1 + backtracking(threshold, rows, cols, marked, x+1, y)
                + backtracking(threshold, rows, cols, marked, x-1, y)
                + backtracking(threshold, rows, cols, marked, x, y+1)
                + backtracking(threshold, rows, cols, marked, x, y-1);
    }

    private static boolean isValid(int threshold, int x, int y){
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

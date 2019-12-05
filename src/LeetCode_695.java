public class LeetCode_695 {

    public static void main(String[] args) {
        LeetCode_695 p = new LeetCode_695();
        p.maxAreaOfIsland(new int[][]{{0, 1}});
    }

    public int maxAreaOfIsland(int[][] grid){
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int max = 0;
        int[] count = new int[1];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    count[0] = 0;
                    dfs(grid, i, j, count);
                    max = Math.max(max, count[0]);
                }
            }
        }
        return max;
    }

    private void dfs(int[][] grid, int x, int y, int[] count){
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1)
            return;
        grid[x][y] = -1;
        count[0]++;
        dfs(grid, x+1, y, count);
        dfs(grid, x, y+1, count);
        dfs(grid, x-1, y, count);
        dfs(grid, x, y-1, count);
    }
}
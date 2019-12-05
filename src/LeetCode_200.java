public class LeetCode_200 {

    private int count = 0;

    public int numIslands(char[][] grid){
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int x, int y){
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1') return;
        grid[x][y] = '0';
        dfs(grid, x-1, y);
        dfs(grid, x+1, y);
        dfs(grid, x, y-1);
        dfs(grid, x, y+1);
    }
}

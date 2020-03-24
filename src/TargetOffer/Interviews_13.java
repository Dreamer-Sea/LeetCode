package TargetOffer;

public class Interviews_13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(m, n, k, 0, 0, visited);
    }

    private int dfs(int m, int n, int k, int x, int y, boolean[][] visited){
        if (x < 0 || x >= m || y < 0 || y >= n || !check(x, y, k) || visited[x][y]) return 0;
        visited[x][y] = true;
        return 1 + dfs(m, n, k, x+1, y, visited) + dfs(m, n, k, x, y+1, visited)
                + dfs(m, n, k, x-1, y, visited) + dfs(m, n, k, x, y-1, visited);
    }

    private boolean check(int x, int y, int k){
        int res = 0;
        while (x != 0){
            res += x % 10;
            x /= 10;
        }
        while (y != 0){
            res += y % 10;
            y /= 10;
        }
        return res <= k;
    }
}

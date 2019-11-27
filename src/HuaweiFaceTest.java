public class HuaweiFaceTest {

    private int count = 0;

    public int countBatlleships(char[][] board){
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == 'X') {
                    board[i][j] = '.';
                    dfs(board, m, n, i, j);
                    board[i][j] = '.';
                }
            }
        }
        return count;
    }

    private void dfs(char[][] board, int m, int n, int x, int y){
        if (x >= m || x < 1 || y >= n || y < 1) return;
        if (board[x+1][y] == '.' && board[x][y+1] == '.' && board[x-1][y] == '.' && board[x][y-1] == '.'){
            count++;
            return;
        }
        for (int i = x; i < m; i++){
            for (int j = y; j < n; j++){
                if (board[i][j] == 'X'){
                    board[i][j] = '.';
                    dfs(board, m, n, i+1, j);
                    dfs(board, m, n, i, j+1);
                    dfs(board, m, n, i-1, j);
                    dfs(board, m, n, i, j-1);
                    board[i][j] = 'X';
                }
            }
        }
    }
}

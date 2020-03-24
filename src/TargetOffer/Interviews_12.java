package TargetOffer;

public class Interviews_12 {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int x, int y, int k){
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || word.charAt(k) != board[x][y]) return false;
        if (k == word.length() - 1) return true;
        char tmp = board[x][y];
        board[x][y] = '/';
        boolean res = dfs(board, word, x+1, y, k+1) || dfs(board, word, x-1, y, k+1) ||
                dfs(board, word, x, y+1, k+1) || dfs(board, word, x, y-1, k+1);
        board[x][y] = tmp;
        return res;
    }
}

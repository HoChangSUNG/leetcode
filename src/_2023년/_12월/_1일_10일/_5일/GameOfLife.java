package _2023년._12월._1일_10일._5일;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int[] dr = new int[]{-1, 0, 1, 0, -1, -1, 1, 1};
        int[] dc = new int[]{0, 1, 0, -1, -1, 1, 1, -1};

        int m = board.length;
        int n = board[0].length;
        int[][] newBoard = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cur = board[i][j];
                int live = 0;
                for (int d = 0; d < 8; d++) {
                    int nextR = i + dr[d];
                    int nextC = j + dc[d];
                    if (-1 < nextR && nextR < m && -1 < nextC && nextC < n) {
                        live += (board[nextR][nextC] & 1);
                    }
                }
                if (live == 3) newBoard[i][j] = 1;
                else if (live == 2) newBoard[i][j] = board[i][j];
                else newBoard[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }
}

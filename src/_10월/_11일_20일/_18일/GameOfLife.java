package _10월._11일_20일._18일;

public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int[] dr = new int[]{-1, 0, 1, 0, -1, -1, 1, 1};
        int[] dc = new int[]{0, 1, 0, -1, -1, 1, 1, -1};
        int[][] next = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int liveCount = 0;
                for (int d = 0; d < 8; d++) {
                    int r = i + dr[d];
                    int c = j + dc[d];
                    if (r >= 0 && r < board.length && c >= 0 && c < board[0].length && board[r][c] == 1) {
                        liveCount++;
                    }
                }
                if (liveCount < 2) next[i][j] = 0;
                else if (liveCount == 2) next[i][j] = board[i][j];
                else if (liveCount == 3) next[i][j] = 1;
                else next[i][j] = 0;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = next[i][j];
            }
        }
    }
}

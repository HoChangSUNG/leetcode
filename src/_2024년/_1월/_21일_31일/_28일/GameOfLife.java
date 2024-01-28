package _2024년._1월._21일_31일._28일;

public class GameOfLife {
    int[] dr = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
    int[] dc = new int[]{0, 1, 1, 1, 0, -1, -1, -1};

    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = countLive(board, i, j);
                if (count == 2) {
                    temp[i][j] = board[i][j];
                }
                if (count == 3) {
                    temp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }

    private int countLive(int[][] board, int r, int c) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nextR = r + dr[i];
            int nextC = c + dc[i];
            if (-1 < nextR && nextR < board.length && -1 < nextC && nextC < board[0].length) {
                if (board[nextR][nextC] == 1) count++;
            }
        }
        return count;
    }
}

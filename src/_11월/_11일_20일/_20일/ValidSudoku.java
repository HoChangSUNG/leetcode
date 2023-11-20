package _11월._11일_20일._20일;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] square = new int[9];
                for (int r = i * 3; r < (i + 1) * 3; r++) {
                    for (int c = j * 3; c < (j + 1) * 3; c++) {
                        if (board[r][c] == '.') continue;
                        int num = board[r][c] - '0';

                        row[r][num - 1] += 1;
                        col[c][num - 1] += 1;
                        square[num - 1] += 1;
                        if (row[r][num - 1] > 1 || col[c][num - 1] > 1 || square[num - 1] > 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

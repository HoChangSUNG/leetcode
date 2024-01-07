package _2024년._1월._1일_10일._7일;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] vertical = new boolean[9][9];
        boolean[][] horizon = new boolean[9][9];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] square = new boolean[9];
                for (int r = i * 3; r < (i + 1) * 3; r++) {
                    for (int c = j * 3; c < (j + 1) * 3; c++) {
                        if (board[r][c] != '.') {
                            int cur = board[r][c] - '0';
                            if (horizon[r][cur - 1] || vertical[c][cur - 1] || square[cur - 1]) return false;
                            horizon[r][cur - 1] = true;
                            vertical[c][cur - 1] = true;
                            square[cur - 1] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}

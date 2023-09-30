package _9월._21일_30일._30일;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    private Set<Character>[] horizontal;
    private Set<Character>[] vertical;
    private Set<Character>[] square;

    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        horizontal = new HashSet[9];
        vertical = new HashSet[9];
        square = new HashSet[9];

        for (int i = 0; i < n; i++) {
            horizontal[i] = new HashSet<Character>();
            vertical[i] = new HashSet<Character>();
            square[i] = new HashSet<Character>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;

                if (horizontal[i].contains(board[i][j])) return false;
                horizontal[i].add(board[i][j]);
                if (vertical[j].contains(board[i][j])) return false;
                vertical[j].add(board[i][j]);
                if (square[3 * (i / 3) + j / 3].contains(board[i][j])) return false;
                square[3 * (i / 3) + j / 3].add(board[i][j]);
            }
        }
        return true;
    }
}

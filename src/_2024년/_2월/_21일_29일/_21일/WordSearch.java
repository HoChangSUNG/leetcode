package _2024년._2월._21일_29일._21일;

public class WordSearch {
    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, 1, 0, -1};

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWordExist(word, i, j, 0, board, visited)) return true;
            }
        }
        return false;
    }

    private boolean isWordExist(String word, int i, int j, int index, char[][] board, boolean[][] visited) {
        // boolean isRight = false;
        if (index == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) return false;
        if (word.charAt(index) != board[i][j]) return false;

        visited[i][j] = true;
        for (int d = 0; d < 4; d++) {
            if (isWordExist(word, i + dr[d], j + dc[d], index + 1, board, visited)) return true;
        }
        visited[i][j] = false;
        return false;
    }
}

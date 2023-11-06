package _11월._1일_10일._7일;

public class WordSearch {
    private int[] dr = new int[]{-1, 0, 1, 0};
    private int[] dc = new int[]{0, 1, 0, -1};

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, word, i, j, 0, visited)) return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int i, int j, int index, boolean[][] visited) {
        if (index == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) return false;
        if (board[i][j] != word.charAt(index)) return false;
        boolean result = false;
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            result |= search(board, word, i + dr[k], j + dc[k], index + 1, visited);
        }
        visited[i][j] = false;
        return result;
    }
}

package _2023년._12월._21일_31일._28일;

public class WordSearch {

    private int[] dr = new int[]{-1, 0, 1, 0};
    private int[] dc = new int[]{0, 1, 0, -1};
    private boolean[][] visited;
    private String word;

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        this.word = word;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isExist(board, 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean isExist(char[][] board, int index, int r, int c) {
        boolean isRight = false;
        if (index == word.length()) return true;
        if (0 > r || r >= board.length || 0 > c || c >= board[0].length || visited[r][c]) return isRight;

        if (board[r][c] != word.charAt(index)) return isRight;

        visited[r][c] = true;

        for (int d = 0; d < 4; d++) {
            int nextR = r + dr[d];
            int nextC = c + dc[d];

            isRight |= isExist(board, index + 1, nextR, nextC);
        }
        visited[r][c] = false;
        return isRight;
    }
}

package _2023년._9월._11일_20일._19일;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int before = image[sr][sc];
        if (before == color) return image;
        dfs(image, sr, sc, before, color);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int before, int to) {
        if (image[sr][sc] != before) return;
        image[sr][sc] = to;
        if (sr + 1 < image.length) dfs(image, sr + 1, sc, before, to);
        if (sr - 1 > -1) dfs(image, sr - 1, sc, before, to);
        if (sc + 1 < image[0].length) dfs(image, sr, sc + 1, before, to);
        if (sc - 1 > -1) dfs(image, sr, sc - 1, before, to);
    }
}

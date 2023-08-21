package _8월._21일_31일._22일;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]) return image;
        setColor(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void setColor(int[][] image, int sr, int sc, int color, int oldColor) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = color;
            if (sr - 1 >= 0) setColor(image, sr - 1, sc, color, oldColor);
            if (sr + 1 < image.length) setColor(image, sr + 1, sc, color, oldColor);
            if (sc - 1 >= 0) setColor(image, sr, sc - 1, color, oldColor);
            if (sc + 1 < image[0].length) setColor(image, sr, sc + 1, color, oldColor);
        }
    }
}

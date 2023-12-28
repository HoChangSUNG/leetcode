package _2023년._8월._21일_31일._26일;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (n % 2 == 0 && j == n / 2) break;
                int a = (image[i][j] + 1) % 2;
                image[i][j] = (image[i][n - 1 - j] + 1) % 2;
                image[i][n - 1 - j] = a;
            }
        }
        return image;
    }
}

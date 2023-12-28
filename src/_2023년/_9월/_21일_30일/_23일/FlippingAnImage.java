package _2023년._9월._21일_30일._23일;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int m = image[0].length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length / 2; j++) {
                int temp = (image[i][j] + 1) % 2;
                image[i][j] = (image[i][m - 1 - j] + 1) % 2;
                image[i][m - 1 - j] = temp;
            }
            if (m % 2 == 1) {
                image[i][m / 2] = (image[i][m / 2] + 1) % 2;
            }
        }
        return image;
    }
}

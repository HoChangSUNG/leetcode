package _7월._11일_20일._18일;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int count = 0;
                int n_l = i + 1 >= img.length ? img.length - 1 : i + 1;
                int m_l = j + 1 >= img[i].length ? img[i].length - 1 : j + 1;

                for (int n = i - 1 < 0 ? 0 : i - 1; n <= n_l; n++) {
                    for (int m = j - 1 < 0 ? 0 : j - 1; m <= m_l; m++) {
                        count++;
                        result[i][j] += img[n][m];
                    }
                }
                result[i][j] /= count;
            }
        }
        return result;
    }
}

package _9월._11일_20일._17일;

public class ImageSmoother {

    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int cnt = 0;
                int sum = 0;
                for (int ni = i - 1; ni <= i + 1; ni++) {
                    for (int nj = j - 1; nj <= j + 1; nj++) {
                        if (0 <= ni && ni < n && 0 <= nj && nj < m) {
                            cnt++;
                            sum += img[ni][nj];
                        }
                    }
                }
                result[i][j] = sum / cnt;
            }
        }
        return result;
    }
}

package _2023년._9월._11일_20일._16일;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left = 0;
        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (left == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                n--;
                flowerbed[i] = 1;
            }
            if (n <= 0) return true;
            left = flowerbed[i];
        }
        if (left == 0 && flowerbed[flowerbed.length - 1] == 0) n--;
        return n <= 0;
    }
}

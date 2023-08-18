package _8월._11일_20일._18일;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int left = 0;
        int right = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) right = 0;
            else right = 1;
            if (flowerbed[i] == 0 && left == 0 && right == 0) {
                flowerbed[i] = 1;
                n--;
            }
            left = flowerbed[i];
            if (n == 0) return true;
        }
        return false;
    }
}

package _2023년._9월._21일_30일._26일;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        for (; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) break;
        }
        if (i == 0 || i == n - 1) return false;
        for (; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) break;
        }
        return i == n - 1 ? true : false;
    }
}

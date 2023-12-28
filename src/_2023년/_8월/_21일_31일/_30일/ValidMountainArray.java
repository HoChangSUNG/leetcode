package _2023년._8월._21일_31일._30일;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) break;
            else if (arr[i] == arr[i + 1]) return false;
        }
        if (i == arr.length - 1 || i == 0) return false;
        for (; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) return false;
        }
        return true;
    }
}

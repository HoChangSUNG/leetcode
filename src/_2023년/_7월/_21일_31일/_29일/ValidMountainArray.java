package _2023년._7월._21일_31일._29일;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
            if (arr[i] > arr[i + 1]) break;
        }
        if (i == 0 || i == arr.length - 1) return false;

        for (; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
            if (arr[i] < arr[i + 1]) return false;
        }
        return true;
    }
}

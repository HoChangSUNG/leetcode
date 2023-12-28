package _2023년._9월._11일_20일._19일;

public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if (letters[n - 1] <= target) return letters[0];
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (letters[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }
        return letters[left];
    }
}

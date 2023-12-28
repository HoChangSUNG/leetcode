package _2023년._8월._21일_31일._22일;

public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int right = letters.length - 1;
        int left = 0;
        int mid = 0;
        if (letters[right] <= target) return letters[0];
        while (left <= right) {
            mid = (right + left) / 2;
            if (letters[mid] <= target) left = mid + 1;
            else right = mid - 1;

        }
        return letters[left];
    }
}

package _7월._21일_31일._21일;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if (letters[n - 1] <= target || letters[0] > target) return letters[0];

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (letters[mid] <= target) low = mid + 1;
            else high = mid - 1;

        }
        return letters[low];
    }
}

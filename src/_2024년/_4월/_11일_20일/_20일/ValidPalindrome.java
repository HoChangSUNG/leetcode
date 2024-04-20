package _2024년._4월._11일_20일._20일;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = getLeftAlphabetIndex(s, 0);
        int right = getRightAlphabetIndex(s, s.length() - 1);

        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left = getLeftAlphabetIndex(s, left + 1);
            right = getRightAlphabetIndex(s, right - 1);

        }
        return true;
    }

    private int getLeftAlphabetIndex(String s, int index) {
        while (index < s.length() && !Character.isLetterOrDigit(s.charAt(index))) {
            index++;
        }
        return index;
    }

    private int getRightAlphabetIndex(String s, int index) {
        while (index >= 0 && !Character.isLetterOrDigit(s.charAt(index))) {
            index--;
        }
        return index;
    }
}

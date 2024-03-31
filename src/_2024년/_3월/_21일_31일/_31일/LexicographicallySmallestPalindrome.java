package _2024년._3월._21일_31일._31일;

public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (s.charAt(left) < s.charAt(right)) {
                    arr[right] = s.charAt(left);
                } else {
                    arr[left] = s.charAt(right);
                }
            }
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}

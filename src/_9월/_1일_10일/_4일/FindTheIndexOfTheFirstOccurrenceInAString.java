package _9월._1일_10일._4일;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean isRight = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) return i;
        }
        return -1;
    }
}

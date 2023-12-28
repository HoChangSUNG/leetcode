package _2023년._7월._1일_10일._5일;

import java.util.ArrayList;

public class FindTheIndexOfTheFirstOccurrenceInaString {
    public int strStr(String haystack, String needle) {
        ArrayList<Integer> first = new ArrayList<>();
        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                first.add(i);
            }
        }
        for (int i = 0; i < first.size(); i++) {
            int start = first.get(i);
            boolean isExist=true;
            for (int idx = 0; idx < needle.length(); idx++) {
                if (start+needle.length()>haystack.length()){
                    isExist=false;
                    break;
                }
                if (haystack.charAt(start + idx) != needle.charAt(idx)) {
                    isExist = false;
                    break;
                }
            }
            if (isExist) {
                return start;
            }
        }
        return -1;
    }
}

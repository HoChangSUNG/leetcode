package _2024년._5월;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomNoteMap = new HashMap<>();
        for(char c : magazine.toCharArray()){
            ransomNoteMap.putIfAbsent(c,0);
            ransomNoteMap.put(c,ransomNoteMap.get(c)+1);
        }
        for(char c : ransomNote.toCharArray()){
            if (ransomNoteMap.containsKey(c) && ransomNoteMap.get(c) > 0) {
                ransomNoteMap.put(c, ransomNoteMap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}

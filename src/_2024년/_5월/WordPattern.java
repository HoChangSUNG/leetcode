package _2024년._5월;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        var splited = s.split(" ");
        var patternMap = new HashMap<Character,String>();
        var reverseMap = new HashMap<String,Character>();
        if(splited.length!=pattern.length()){
            return false;
        }
        for(int i = 0; i<splited.length;i++){
            var key = pattern.charAt(i);
            var value = splited[i];
            if(!value.equals(patternMap.computeIfAbsent(key,v->value)))return false;
            if(key!= reverseMap.computeIfAbsent(value, k -> key))return false;
        }
        return true;
    }
}

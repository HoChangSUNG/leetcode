package _2024년._2월._11일_20일._17일;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    private Map<Character,String> letterMap;
    private List<String> result;

    public List<String> letterCombinations(String digits) {
        letterMap = new HashMap<>();
        result = new ArrayList<>();
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");

        if(digits.length()==0)return result;
        findCombinations(digits, 0, "", result);
        return result;
    }

    private void findCombinations(String digits,int index, String comb,List<String> result){
        if(index==digits.length()){
            result.add(comb);
            return;
        }

        for(Character letter:letterMap.get(digits.charAt(index)).toCharArray()){
            findCombinations(digits, index+1, comb+letter, result);
        }
    }
}

package _10월._1일_10일._8일;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    Map<Integer,Integer> memo =  new HashMap<>();
    public int numDecodings(String s) {
        return getDecode(0,s);
    }

    int getDecode(int index,String s){
        if(memo.containsKey(index)){
            return memo.get(index);
        }
        if(index==s.length())return 1;
        if(s.charAt(index)=='0') return 0;
        int count = getDecode(index+1,s);

        if(Integer.valueOf(s.substring(index,index+2))<=26){
            count += getDecode(index+2,s);
        }
        memo.put(index,count);
        return count;
    }


}

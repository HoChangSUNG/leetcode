package _2024년._1월._21일_31일._22일;

public class DecodeWays {

    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        if(s.charAt(0)=='0')return 0;

        dp[0]=1;
        dp[1]=1;
        for(int i = 1;i<s.length();i++){
            int cur = s.charAt(i) - '0';
            if(0<cur && cur<10) dp[i+1] += dp[i];
            int number = (s.charAt(i-1)-'0')*10 + s.charAt(i)-'0';
            if(9<number && number<27) dp[i+1] += dp[i-1];
        }
        return dp[s.length()];
    }
}

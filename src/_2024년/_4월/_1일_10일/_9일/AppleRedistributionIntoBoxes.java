package _2024년._4월._1일_10일._9일;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AppleRedistributionIntoBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        int answer = 0;
        int n = capacity.length;
        for (int count : apple) {
            sum += count;
        }

        Arrays.sort(capacity);
        for (int i = n - 1; i >= 0 && sum > 0; i--) {
            answer += 1;
            sum -= capacity[i];
        }
        return answer;
    }
}

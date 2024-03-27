package _2024년._3월._21일_31일._27일;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length, m = queries.length;
        int answer[] = new int[m];


        for (int i = 0; i < m; ++i) {
            int count = 0;
            int query = queries[i];
            for (int num : nums) {
                if (query >= num) {
                    count++;
                    query -= num;
                } else
                    break;
            }
            answer[i] = count;
        }
        return answer;
    }
}

package _2024년._1월._1일_10일._10일;

public class JumpGameTwo {

    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int further = 0;
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            further = Math.max(further, i + nums[i]);

            if (i == end) {
                end = further;
                answer++;
            }
        }
        return answer;
    }
}

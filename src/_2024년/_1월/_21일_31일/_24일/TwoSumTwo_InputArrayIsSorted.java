package _2024년._1월._21일_31일._24일;

public class TwoSumTwo_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int cur = numbers[start] + numbers[end];
            if (cur == target) {
                return new int[]{start + 1, end + 1};
            } else if (cur > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }
}

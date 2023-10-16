package _10월._11일_20일._16일;

public class TwoSumII_InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        while (index1 < index2) {
            int sum = numbers[index1] + numbers[index2];
            if (sum < target) index1++;
            else if (sum > target) index2--;
            else return new int[]{index1 + 1, index2 + 1};
        }
        return null;
    }
}

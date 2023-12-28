package _2023년._7월._1일_10일._5일;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] numCount = new int[201];
        int[] newNums = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (numCount[nums[i]+100]==0){
                numCount[nums[i]+100]=1;
                newNums[j++] = nums[i];
            }

        }
        int result = Arrays.stream(numCount).sum();
        for(int i=0;i<result;i++){
            nums[i] = newNums[i];
        }
        return result;

    }
}

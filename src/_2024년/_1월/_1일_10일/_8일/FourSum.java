package _2024년._1월._1일_10일._8일;

import java.util.*;
import java.util.stream.Collectors;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                int low = j+1;
                int high = n -1;
                while(low<high){
                    long sum = nums[i]+nums[j]+nums[low]+nums[high];
                    if(target<sum)high--;
                    else if(target>sum)low++;
                    else{
                        List<Integer> same = List.of(nums[i], nums[j], nums[low++], nums[high--]);
                        result.add(same);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}

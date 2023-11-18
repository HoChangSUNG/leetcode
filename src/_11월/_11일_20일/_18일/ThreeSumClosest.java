package _11월._11일_20일._18일;

import java.util.*;

public class ThreeSumClosest {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                int low = j+1;
                int high = n-1;
                while(low<high){
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[low]+(long)nums[high];
                    long diff = (long)target-sum;
                    if(diff<0)high--;
                    else if(diff>0)low++;
                    else {
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[low++]);
                        temp.add(nums[high--]);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList(result);
    }

}

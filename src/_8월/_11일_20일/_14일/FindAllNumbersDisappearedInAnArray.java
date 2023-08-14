package _8월._11일_20일._14일;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            nums[nums[i] % 100001 - 1] = nums[nums[i] % 100001 - 1] % 100001 + 100001;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 100001) a.add(i + 1);
        }
        return a;
    }
}

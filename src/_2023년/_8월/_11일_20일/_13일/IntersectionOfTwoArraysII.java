package _2023년._8월._11일_20일._13일;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) j++;
            else if (nums1[i] == nums2[j]) {
                arr.add(nums1[i]);
                i++;
                j++;
            } else i++;
        }
        int[] result = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        return result;
    }
}

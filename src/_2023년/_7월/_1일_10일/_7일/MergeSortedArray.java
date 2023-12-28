package _2023년._7월._1일_10일._7일;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            num1Copy[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (num1Copy[i] < nums2[j]) {
                nums1[index++] = num1Copy[i];
                i++;
            } else {
                nums1[index++] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            nums1[index++] = num1Copy[i++];
        }
        while (j < n) {
            nums1[index++] = nums2[j++];
        }
    }
}

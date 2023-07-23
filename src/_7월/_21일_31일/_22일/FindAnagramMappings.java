package _7월._21일_31일._22일;

public class FindAnagramMappings {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] mapping = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    mapping[i] = j;
                    nums2[j] = -1;
                    break;
                }
            }
        }
        return mapping;
    }
}

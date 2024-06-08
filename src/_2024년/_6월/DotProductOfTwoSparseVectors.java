package _2024년._6월;

public class DotProductOfTwoSparseVectors {
    private int[] nums;
    DotProductOfTwoSparseVectors(int[] nums) {
        this.nums = nums;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(DotProductOfTwoSparseVectors vec) {
        int product = 0;
        for(int i = 0;i<nums.length;i++){
            product += (nums[i]*vec.nums[i]);
        }
        return product;
    }
}

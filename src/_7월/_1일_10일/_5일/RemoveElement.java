package _7월._1일_10일._5일;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                temp[index++] =nums[i];
            }
        }
        for(int i=0;i<index;i++){
            nums[i] = temp[i];
        }
        return index;
    }
}

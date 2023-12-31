package _2023년._9월._11일_20일._12일;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(a==nums[i]|| b==nums[i]|| c==nums[i]) continue;

            if(nums[i]>a){
                c=b;
                b=a;
                a=nums[i];
            }
            else if(nums[i]>b){
                c=b;
                b=nums[i];
            }
            else if(nums[i]>c){
                c=nums[i];
            }
        }
        return c!=Long.MIN_VALUE ? (int)c: (int)a;
    }

}

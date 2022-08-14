public class LC1 {
    public int reversePairs(int[]nums){
        int res=0;
        for(int i=0;i<nums.length;i++)
            for(int j=i;j<nums.length;j++)
                if(nums[i]>nums[j])
                    res++;
                return res;
    }//此种算法性能差，耗时较长
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]<=0||nums[i]>len)
            {
                nums[i]=len+1;
            }
        }
        for(int i=0;i<len;i++)
        {
            int x = Math.abs(nums[i]);
            if(x<=len)
            {
                nums[x-1]= -Math.abs(nums[x-1]);
            }
        }
        for(int i=0;i<len;i++)
        {
            if(nums[i]>0)
            {
                return i+1;
            }
        }

        return len+1;

              
    }   
}

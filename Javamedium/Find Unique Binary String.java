class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String ans = "";
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i].charAt(i)=='1')
                   ans= ans+ '0';
            else
                   ans = ans+'1';       
        }
     return ans;   
    }
}


1980. Find Unique Binary String

class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=0;// index that uinque value
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[j++]=nums[i];
         
            }
               
        }
        nums[j++]=nums[n-1];
        //int k=nums.length;
        return j;
    }
}
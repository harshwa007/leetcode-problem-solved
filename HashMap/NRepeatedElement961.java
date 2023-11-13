class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length/2;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==len)
            {
                return nums[i];
            }
        }
        return 0;
    }
}

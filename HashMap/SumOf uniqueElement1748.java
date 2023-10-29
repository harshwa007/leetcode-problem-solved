class Solution {
    public int sumOfUnique(int[] nums) {

        int sum=0;
    HashMap<Integer,Integer> hm =new HashMap<>(nums.length);
    for(int i=0;i<nums.length;i++)
    {
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
    for(Map.Entry<Integer,Integer> e:hm.entrySet())
    {
        if(e.getValue()==1)
        {
            sum+=e.getKey();
        }
    }
    return sum;

    }
}


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        boolean getAns=true;
        HashSet<Integer> hp=new HashSet<>();
        for(int value:hs.values())
        {
            if(hp.contains(value))
            {
                getAns=false;
                break;
            }
            hp.add(value);
        }
        return getAns;
        //  ArrayList<Integer> val = hs.values();

        //  for (int value : val) {
        //     if (hs.containsValue(value)) {
        //         return false;
        //     }
        // }
        // return true;
            

        }
}
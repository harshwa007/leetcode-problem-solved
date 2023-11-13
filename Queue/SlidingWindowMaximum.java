package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> Qi=new ArrayDeque<Integer>();
        int i;
        //List<Integer> list=new ArrayList<Integer>();
        int arr[]=new int[(nums.length)-k+1];
        for(i=0;i<k;++i)
        {
            //for every element the prev samller element are useless so remove them in Qi
            while(!Qi.isEmpty() && nums[i]>=nums[Qi.peekLast()])
            {
                //remove from last
                Qi.removeLast();
            }
            Qi.addLast(i);   // add @ rear of queue
        }
        arr[0]=nums[Qi.peek()];
        int ct=1;
        //process rest of element i.e. from arr[k] to arr[n-1]
        for(;i<nums.length;++i)
        {
            //remove ele which are out of window
            while((!Qi.isEmpty()) && Qi.peek()<=i-k)
            {
                Qi.removeFirst();
            }
            // remove all element smaller than currently being added element and remove //  useless element
            while((!Qi.isEmpty())&& nums[i]>=nums[Qi.peekLast()])
            {
                Qi.removeLast();
            }
            Qi.addLast(i);
            //the element at front queue is largest element of prev window so add it 
            arr[ct]=nums[Qi.peek()];
            ct++;
        }
        return arr;
    }
}
}

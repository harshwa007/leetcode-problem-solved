class Solution {
    public int[] prevSmaller(int a[])
    {
        int ps[]=new int[a.length];
        Stack <Integer> s =new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            while(!s.isEmpty() && a[s.peek()] >= a[i])
            {
                s.pop();
            }
        
            if(s.isEmpty())
            {
                ps[i]=-1;
            }
            else
            {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public int[] nextSmaller(int a[])
    {
        int ps[]=new int[a.length];
        Stack <Integer> s =new Stack<>();

        for(int i=a.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && a[s.peek()] >=a[i])
            {
                s.pop();
            }
        
            if(s.isEmpty())
            {
                ps[i]=a.length;
            }
            else
            {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public int largestRectangleArea(int[] heights) {
        int maxAns=Integer.MIN_VALUE;
        int ps[]=prevSmaller(heights);
        int ns[]=nextSmaller(heights);
        for(int i=0;i<heights.length;i++)
        {
            int curr = (ns[i]-ps[i]-1)*heights[i];
            maxAns=Math.max(maxAns,curr);
        }
        return maxAns;
    }
}


// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int maxArea = Integer.MIN_VALUE;

//         int[] prevSmaller = getPrevSmaller(heights);
//         //System.out.println(Arrays.toString(prevSmaller));
//         int[] nextSmaller = getNextSmaller(heights);
//         //System.out.println(Arrays.toString(nextSmaller));

//         /**
//          *           1  6  4  4  6  6     -->  (indices of next smaller element)
//          *      <-- -1 -1  1  2  1  4          (indices of prev smaller element)
//          *           2, 1, 5, 6, 2, 3          (Array of heights)
//          * Indices = 0  1  2  3  4  5
//          */
//         for (int i = 0; i < heights.length; i++) {

//             /**
//              * At every height, find the next smaller height and prev smaller height
//              * and subtract 1 from the distance between the 2 smaller heights so that
//              * we EXCLUDE BOTH the smaller heights (prev AND next) from either sides.
//              *
//              * Once we find that horizontal distance, multiply that with the current
//              * height to get the current max area
//              */
//             int currentMaxArea = (nextSmaller[i] - prevSmaller[i] - 1) * heights[i];
//             maxArea = Math.max(maxArea, currentMaxArea);
//         }

//         return maxArea;
//     }

//     private int[] getNextSmaller(int[] h) {
//         int[] nextSmaller = new int[h.length];

//         Stack<Integer> s = new Stack<Integer>();

//         /**
//          *           1  6  4  4  6  6     -->  (indices of next smaller element)
//          *           2, 1, 5, 6, 2, 3 (Array of heights)
//          * Indices = 0  1  2  3  4  5
//          */
//         int len = h.length;
//         for (int i = len - 1; i >= 0; i--) {
//             while (!s.isEmpty() && h[i] <= h[s.peek()]) {
//                 s.pop(); // Keep removing from stack till stack is empty OR we find element just smaller or equal to h[i]
//             }
//             if (s.isEmpty()) { // If stack becomes empty
//                 nextSmaller[i] = len; // Add next smaller element LOCATION as length, which would be 1 index more than the last index
//             } else {
//                 nextSmaller[i] = s.peek(); // Else add LOCATION as top element in stack
//             }
//             s.push(i);
//         }

//         return nextSmaller;
//     }

//     private int[] getPrevSmaller(int[] h) {
//         int[] prevSmaller = new int[h.length];

//         Stack<Integer> s = new Stack<Integer>();

//         /**
//          *      <-- -1 -1  1  2  1  4 (indices of prev smaller element)
//          *           2, 1, 5, 6, 2, 3 (Array of heights)
//          * Indices = 0  1  2  3  4  5
//          */
//         for (int i = 0; i < h.length; i++) {
//             while (!s.isEmpty() && h[i] <= h[s.peek()]) {
//                 s.pop(); // Keep removing from stack till stack is empty OR we find element just smaller or equal to h[i]
//             }
//             if (s.isEmpty()) { // If stack becomes empty
//                 prevSmaller[i] = -1; // Add prev smaller element LOCATION as -1
//             } else {
//                 prevSmaller[i] = s.peek(); // Else add LOCATION as top element in stack
//             }
//             s.push(i);
//         }

//         return prevSmaller;
//     }
// }


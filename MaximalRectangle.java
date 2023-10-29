//leetcode pm 85


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
    public int maximalRectangle(char[][] matrix) {
            int n=matrix.length;
            int m=matrix[0].length;
            int [] convertedArray=new int[m];
            for(int j=0;j<m;j++)
            {
                convertedArray[j]=matrix[0][j]-'0';
            }
            int maxArea=largestRectangleArea(convertedArray);
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(matrix[i][j]=='0')
                    {
                        convertedArray[j]=0;
                    }
                    else
                    {
                        convertedArray[j]+=matrix[i][j] - '0';
                    }
                }
                maxArea=Math.max(maxArea,largestRectangleArea(convertedArray));
            }
        return maxArea;
    }
}

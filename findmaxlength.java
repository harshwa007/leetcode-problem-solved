
/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * Write your code in this editor and press "Run" button to execute it.
 * 
 *******************************************************************************/
// import java.util.HashMap;

// public class findmaxlength {
// public static void main(String[] args) {
// // System.out.println("Hello World");
// // int arr[]={100,10,50,30,10,100,50,50};
// // int arr[]={10,90,80,90,60,40,65,78,75};
// int arr[] = { 10, 50, 30, 5 };
// int sum = 100;// k
// int maxlength = 0;
// int currsum = 0;
// int start = 0;
// int end = -1;
// int length = 0;
// int first = 0, last = 0;
// HashMap<Integer, Integer> hs = new HashMap<>();
// for (int i = 0; i < arr.length; i++) {
// currsum = currsum + arr[i];
// if (currsum - sum == 0) {
// start = 0;
// end = i;
// }
// if (hs.containsKey(currsum - sum)) {
// start = hs.get(currsum - sum) + 1;
// end = i;
// }
// hs.put(currsum, i);
// length = end - start + 1;
// if (length > maxlength) {
// maxlength = length;
// first = start;
// last = end;
// }
// }
// System.out.println("Maximum count= " + (maxlength));
// // for(int i=first;i<=last;i++)
// // {
// // System.out.print(arr[i] +" ");
// // }
// }
// }

public class findmaxlength {
	public static void main(String[] args) {
		int[] prices = { 2, 1, 5, 1, 3 };
		int maxlength = Integer.MIN_VALUE;
		int end;
		int start = 0;
		int sum = 0;
		int target = 10;
		for (end = 0; end < prices.length; end++) {
			sum += prices[end];
			while (sum >= target) {
				sum -= prices[start];
				start++;
			}
			maxlength = Math.max(maxlength, end - start );
		}
		System.out.println("Maxlength: " + maxlength);
		int totalsum = 0;
		for (int i = start; i <= end; i++) {
			System.out.println(prices[i] + ",");
			totalsum += prices[i];
		}
		System.out.println("Total sum" + totalsum);

	}
}
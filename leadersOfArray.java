import java.util.*;
public class Main
{
	public static void main(String[] args) {
         int arr[]={10, 22, 12, 3, 0, 6};
         int max=arr[arr.length-1];
         int leader=arr[arr.length-1];
         System.out.println(leader);
         for(int i=arr.length-2;i>=0;i--)
         {
             if(arr[i]>max)
             {
                 leader=arr[i];
                 max=arr[i];
                System.out.println(leader);
             }
             
         }


	}
}

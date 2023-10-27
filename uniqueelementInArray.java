import java.util.*;
public class Main
{
	public static void main(String[] args) {
         int arr[]={18,45,1,7,45,10,1};
         HashSet<Integer>hs=new HashSet<>();
         hs.add(arr[0]);
         for(int i=1;i<arr.length;i++)
         {
             if(!hs.contains(arr[i]))
             {
                 hs.add(arr[i]);
             }
             else{
                 hs.remove(arr[i]);
             }
         }
         System.out.println(hs);
	}
}

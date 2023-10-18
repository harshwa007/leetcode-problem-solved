/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
import java.util.*;
public class Main {

  public static int solution(int[] arr) {
    // write your code here
    int count  = 0;
    HashMap< Integer, Integer> hmap = new HashMap< >();
    int i = -1;
    int sum = 0;
    hmap.put(sum, i);

    while (i < arr.length - 1) {

      i++;
      sum += arr[i];

      if (hmap.containsKey(sum)) {

        count += hmap.get(sum);
        hmap.put(sum, hmap.get(sum) + 1);
      } else {
        hmap.put(sum, 1);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    scn.close();
    System.out.println(solution(arr));

  }

}

*/
import java.util.*;
public class Main {
public static void main(String[] args) {
    int count=0;
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    scn.close();
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==0)
        {
            count++;
        }
    }
    int ans=(count*(count+1))/2;
    System.out.println("Total count"+ans);
  }
}

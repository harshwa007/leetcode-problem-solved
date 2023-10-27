import java.util.*;
public class Main
{
	public static void main(String[] args) {
       System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }
        System.out.print("\nData you entered : \n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
            System.out.print(twoD[i][j]+"  ");
            }
            System.out.println();
        }	
        for(int i=0;i<rows;i++){
            if(i%2==0)
            {
                for(int j=columns-1;j>=0;j--)
                {
                    System.out.print(twoD[i][j]+"  ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<columns;j++)
                {
                    System.out.print(twoD[i][j]+"  ");
                }
                System.out.println();
            }
        }
	}
}

/*
Enter 2D array size : 3
3
Enter array elements : 
1
2
3
4
5
6
7
8
9

Data you entered : 
1  2  3  
4  5  6  
7  8  9  
3  2  1  
4  5  6  
9  8  7
*/

/* TUTORIAL 2 (MODULE 2)
 * Name: Lijo Jolly
 * Roll Number: 57
 * Class: CSE - C
 * Q4
 */

package icarus_TUT2;
import java.util.Arrays;

public class SEARCH_2D_MATRIX 
{
 public static void main(String[] args)
 {
     int arr[][] = { { 3, 12, 9 },
                     { 5, 2, 89 },
                     { 90, 45, 22 } };
     
     
     int target = 89;    
     int ans[] = linearSearch(arr, target);
     
     
     System.out.println("Element found at index: "
                        + Arrays.toString(ans));
 }

 static int[] linearSearch(int[][] arr, int target)
 {
     
	 for (int i = 0; i < arr.length; i++) 
	 {
         for (int j = 0; j < arr[i].length; j++) 
         {
             if (arr[i][j] == target) 
             {
                 return new int[] { i, j };
             }
         }
     }
     return new int[] { -1, -1 };
 }
}

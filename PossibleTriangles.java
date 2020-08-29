/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Count the number of possible triangles
// Input: arr= {4, 6, 3, 7}
// Output: 3

/* Name of the class has to be "Main" only if the class is public. */
class PossibleTriangles
{
    
    public static int getNoOfTriangles(int[] arr){
        Arrays.sort(arr); //{3, 4, 6, 7}
        
        int n = arr.length;
        int ans = 0;
        for(int i = 0;i<n-2;i++){
          for(int j = i+1;j<n-1;j++){
              int k =  n-1;
               while(j<k){
                   if(arr[i] + arr[j] > arr[k]){
     
                       ans += k - j;
                       break;
                   }else {
                       k--;
                   }
               }
          }
        }
        
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr = new int[]{10, 21, 22, 100, 101, 200, 300};
        
        System.out.println(getNoOfTriangles(arr));
		// your code goes here
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Count triplets with sum smaller than a given value

// Input : arr[] = {-2, 0, 1, 3}
//         sum = 2.
// Output : 2
// Explanation :  Below are triplets with sum less than 2
//               (-2, 0, 1) and (-2, 0, 3) 

// O(n^3) to O(nlogn)

/* Name of the class has to be "Main" only if the class is public. */
class PossibleTri
{
    //  return the no. of groups of size 3 which sum smaller than or quals to given sum
    public static int getGroups(int[] arr , int sum){
        int count = 0;
        Arrays.sort(arr);
        
        int n = arr.length;
        
        for(int i = 0; i<n-2; i++){
            int j = i+1;
            int k = n-1;
            
          while(j < k){
            if(arr[i] + arr[j] + arr[k] < sum){
              count += k - j;  
              j++;
            }
            
            k--;
          }
        }
        
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int sum = 2;
	    int[] arr = new int[]{-2, 0, 1, 3};
		// your code goes here
		
		System.out.println(getGroups(arr,sum));
	}
}

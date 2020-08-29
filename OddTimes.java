/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Find the Number Occurring Odd Number of Times

// Input : arr = {1, 2, 3, 2, 3, 1, 3}
// Output : 3

// neive approch which is brute force O(n^2) time complexity
// other approch by using hash map O(n) time complexity, space complexity O(n)
//  other approch using xor O(n) time complexity but space complexity O(1)

/* Name of the class has to be "Main" only if the class is public. */
class OddTimes
{
    public static int getTheOddNo(int[] arr){
        int n = arr.length;
        int x = 0;
        for(int i = 0;i<n;i++){
           x = x^arr[i];
        }
        
        return x;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = new int[] {1, 2, 3, 2, 3, 1, 3};
	    
	    System.out.println(getTheOddNo(arr));
		// your code goes here
	}
}

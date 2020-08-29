/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Find a Fixed Point (Value equal to index) in a given array
//  Input: arr[] = {-10, -5, 0, 3, 7}
//   Output: 3  // arr[3] == 3 


/* Name of the class has to be "Main" only if the class is public. */
class FixedPoint
{
    public static int  binarySearch(int[] arr,int l,int r){
        if(l > r){
            return -1;
        }
        
        int mid  = (l+r)/2;
        
        if(mid == arr[mid]){
            return mid;
        }
        
        if(mid < arr[mid]){
            return  binarySearch(arr,l,mid-1);
        }
        
        if(mid > arr[mid]){
            return binarySearch(arr,mid+1,r);
        }
        
        return -1;
    }
    
    public static int fixedPoint(int[] arr){
        return binarySearch(arr,0,arr.length);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = new int[]{-10, -5, 0, 3, 7};
		// your code goes here
		
		System.out.println(fixedPoint(arr));
	}
}

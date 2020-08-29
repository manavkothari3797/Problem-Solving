/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/

// O(n) time and O(1) extra space
// For example, if the input array is [2, -3, 5 ,-1, 4,-7, 6,8, 9],
// then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]

//  O(nlogn)
/* Name of the class has to be "Main" only if the class is public. */
class Rearrange
{
    
    // rearrange the elements;
    public static void rearrange(int[] arr,int n){
        int left = -1;
        
        for(int i = 0; i< n; i++){
            if(arr[i] < 0){
                left++;
                
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] =temp;
            }
        }
        
        int neg = 0;
        int pos = left + 1;

        while(arr[neg] < 0){
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            
            neg +=2;
            pos +=2;
        }        
    
        printArr(arr);
    }
    
    public static void printArr(int[] arr){
        for(int value:arr){
            System.out.println(value);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
	    int[] arr = new int[] {-1, 2, -3, 4, 5, 6, -7, 8, 9};
	    int n = arr.length;
	    
	    rearrange(arr,n);
	}
}

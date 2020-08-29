/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
 
// Count number of occurrences (or frequency) in a sorted array
//  O(log(n));

/* Name of the class has to be "Main" only if the class is public. */
class NoOfOccurance
{
        // returns firstOccurance of x
        public static int firstOccurance(int[] arr,int l,int r,int x){
            if(l > r || r >= arr.length || l < 0){
                return -1;
            }
            
            int mid = (l+r)/2;
            
            if((mid == 0 || arr[mid-1] < x ) && arr[mid] == x){
                return mid;
            }
            
            if(x <= arr[mid]){
              return firstOccurance(arr,l,mid-1,x);  
            }
            
            if(x > arr[mid]){
                 return firstOccurance(arr,mid+1,r,x);    
            }
            
            return -1;
        }
    
        // last occurrences of x
        public static int lastOccurance(int[] arr,int l,int r,int x){
            if(l > r){
                return -1;
            }
            
            int mid = (l+r)/2;
            
            if((mid == arr.length - 1  || arr[mid+1] > x ) && arr[mid] == x){
                return mid;
            }
            
            if(x < arr[mid]){
              return lastOccurance(arr,l,mid-1,x);  
            }
            
            if(x >= arr[mid]){
                 return lastOccurance(arr,mid+1,r,x);    
            }
            
            return -1;
        }
    
    public static int getFrequency(int[] arr,int x){
       int count = 0;
       
       int firstOccuranceOfX = firstOccurance(arr,0,arr.length,x);
       
       if(firstOccuranceOfX == -1){
           return -1;
       }
       
       int lastOccuranceOfx = lastOccurance(arr,firstOccuranceOfX,arr.length,x);
       
       
       return lastOccuranceOfx - firstOccuranceOfX + 1;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    int[] arr = new int[]{2,2, 2, 2, 2, 2, 2};
	    int x = 3;
	    
		System.out.println(getFrequency(arr,x));
	}
}

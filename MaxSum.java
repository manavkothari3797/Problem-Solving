/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Get the max sum where values are not adjusant
// {5, 5, 10, 100, 10, 5}

/* Name of the class has to be "Main" only if the class is public. */
class MaxSum
{
    // return the max value which does not have adjusant values
    public static int getTheMax(int[] arr,int n){
        int inc = arr[0];
        int excl = 0;
        int excl_new = 0;
        
        for(int i = 1; i<n;i++){
            excl_new = (inc > excl) ? inc : excl;
            
            inc = excl + arr[i];
            excl = excl_new;
        }
        
        return Math.max(inc,excl);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr = new int[]{5, 5, 10, 100, 10, 5};
        int n = arr.length;
        
        System.out.println(getTheMax(arr,n));
		// your code goes here
	}
}

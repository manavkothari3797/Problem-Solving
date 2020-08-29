/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Find four elements that sum to a given value | Set 1 (n^3 solution)
// {10, 20, 30, 40, 1, 2}; and X = 91, output: 20, 30, 40, 1

// neive solution O(n^4);
//  need find solution O(n^3)

/* Name of the class has to be "Main" only if the class is public. */
class SumOfFour
{
    public static void getGroup(int[] arr,int x){
        Arrays.sort(arr); // { 1, 2,10, 20, 30, 40}   
        
        int n = arr.length;
        
        for(int i = 0;i<n-3;i++){
            for(int j = i+1;i<n-2;j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    if(arr[i] + arr[j] + arr[k] + arr[l] == x){
                        System.out.println(arr[i]);
                        System.out.println(arr[j]);
                        System.out.println(arr[k]);
                        System.out.println(arr[l]);
                        k++;
                        l--;
                    } else if(arr[i] + arr[j] + arr[k] + arr[l] < x){
                        k++;
                    }else {
                        l--;   
                    }
                }
                
            }
        }
    
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr =new int[] {10, 20, 30, 40, 1, 2};
		int x = 91;
		
		getGroup(arr,x);
	}
}

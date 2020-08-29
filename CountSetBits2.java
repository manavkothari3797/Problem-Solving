/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//  n = 6 no of set bits 9
// 1 0001
// 2 0010
// 3 0011
// 4 0100
// 5 0101
// 6 0110

//on 0th position the value will switch on ever 2^0 times
//on`1st position the value will switch on every 2^1 times
// basic approch which will count all set bits time complexity of that algo O(nlogn)

/* Name of the class has to be "Main" only if the class is public. */
class CountSetBits2
{   
    // return no of set bits of value n
    public static int getNoOfSetBits(int n){
        int count = 0;
        
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        
        return count;
    }
    
    // return no of set bits for all values till n
    public static int countSetBits(int n){
        int count = 0;
        
        for(int i = 1;i<= n;i++){
            count += getNoOfSetBits(i);
        }
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n = 6;
	    System.out.println(countSetBits(n));
		// your code goes here
	}
}

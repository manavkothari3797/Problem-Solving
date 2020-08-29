/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// Count number of bits to be flipped to convert A to B
// a = 10; 00001010
// b = 20; 00010100

// 1 0 = 1
// 0 1 = 1
// 0 0 = 0
// 1 1 = 0


// 10 ^ 20 00011110

/* Name of the class has to be "Main" only if the class is public. */
class Convert
{
    public static int countOfSetBits(int n){
        int count = 0;
        
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a = 10;
		int b = 20;
		
		System.out.println(countOfSetBits(a ^ b));
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.geeksforgeeks.org/tiling-problem/
/* Name of the class has to be "Main" only if the class is public. */
class Tile
{
    public static int noOfWays(int n){
        int[] ways = new int[n+1];
            
        ways[1] = 1;
        ways[2] = 2;
        
        for(int  i = 3; i<= n;i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        
        return ways[n];
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n = 6;
	    
	    System.out.println(noOfWays(n));
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// print the all binary values from 1 to n
// Input: n = 5
// Output: 1, 10, 11, 100, 101

/* Name of the class has to be "Main" only if the class is public. */
class BinaryValues
{
    public static void printBinaries(int n){
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            
            q.remove();
            
            System.out.println(s1);
            
            String s2 = s1;
            
            q.add(s1 +"0");
            q.add(s2 +"1");
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n = 10;
	    
	    printBinaries(n);
		// your code goes here
	}
}

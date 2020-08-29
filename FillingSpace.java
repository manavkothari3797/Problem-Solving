/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// Print all possible strings that can be made by placing spaces

// Input:  str[] = "ABC"
// Output: ABC
//         AB C
//         A BC
//         A B C

// consider once 
// ignore once

// n + n-1


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void printAllPossibleStr(String str,char[] buff,int i,int j){
        
        if(i == str.length()){
            buff[j] = '\0';
            System.out.println(buff);
            return;
        }

        
        // ignoreing it
        // Either put the character 
        buff[j] = str.charAt(i);
        
        printAllPossibleStr(str,buff,i+1,j+1);
        
        // considerit
        buff[j] = ' ';
        buff[j+1] = str.charAt(i);
        
        printAllPossibleStr(str,buff,i + 1,j+2);
        
        return;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "ABC";
		int len = str.length();
		char[] buff = new char[len + len];
		buff = str.charAt(1);
		printAllPossibleStr(str,buff,1,1);
	}
}

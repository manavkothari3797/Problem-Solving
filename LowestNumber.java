/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// Build Lowest Number by Removing n digits from a given number

// Input: str = "4325043", n = 3
// Output: "2043"


/* Name of the class has to be "Main" only if the class is public. */
class LowestNumber
{
    public static void getSmallerString(String result,String str,int n){
        
        if(n == 0){
            result = result.concat(str);
            
            System.out.println(result);
            return;
        }
        
        int minIndex = 0;
        for(int i = 0;i<= n;i++){
            if(str.charAt(i) < str.charAt(minIndex)){
                minIndex = i;
            }
        }
        
        result += str.charAt(minIndex);
        
        String newStr = str.substring(minIndex + 1);
        
        getSmallerString(result,newStr,n-minIndex);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    String str = "765028321";
	    int n = 5;
	
		// your code goes here
	    getSmallerString("",str,n);
	    
	}
}

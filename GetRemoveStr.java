/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.geeksforgeeks.org/remove-characters-from-the-first-string-which-are-present-in-the-second-string/
// String str = "geeksforgeeks"; 
// String mask_str = "mask"; 

/* Name of the class has to be "Main" only if the class is public. */
class GetRemoveStr
{
    public static int[] freq(String str){
        int[] count = new int[256];
        
        char[] charArr = str.toCharArray();
        
        for(char ch:charArr){
            count[ch]++;
        }
        
        return count;
    }
    
    public static String printRemovedChar(String str,String mask_str){
        int[] count = freq(mask_str);   
        
        char[] charArr = str.toCharArray();
        
        char[] result = new char[charArr.length];
        
        int result_index = 0;
        for(char ch : charArr){
            if(count[ch] == 0){
                result[result_index++]  = ch;
            }
        }
        
        String new_str = new String(result);
        
        return new_str.substring(0,result_index);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "geeksforgeeks"; 
        String mask_str = "mask"; 
        
        System.out.println(printRemovedChar(str,mask_str));
	}
}

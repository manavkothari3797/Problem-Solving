/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Find uncommon characters of the two strings
// Input: str1 = “characters”, str2 = “alphabets”
// Output: b c l p r

/* Name of the class has to be "Main" only if the class is public. */
class UncommonChar
{
    public static void getUncommon(String str1,String str2){
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0 ;i<str1.length();i++){
            map.put(str1.charAt(i),1);
        }
         for(int i = 0 ;i<str2.length();i++){
            map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i),0)+1);
        }
        
        for(Map.Entry<Character,Integer> el : map.entrySet()){
            if(el.getValue() == 1){
                System.out.println(el.getKey());
            }
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1 = "characters";
		String str2 = "alphabets";
		
		getUncommon(str1,str2);
	}
}

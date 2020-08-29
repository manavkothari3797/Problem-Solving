/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Input : 10 20
// Output : 10 12 13 14 15 16 17 18 19 20  (Except 11)

/* Name of the class has to be "Main" only if the class is public. */

class UniqueNumbers
{
    public static boolean isUnique(int num){
        boolean[] isRepeted = new boolean[10];
        
        while(num > 0){
            if(isRepeted[num % 10] == true){
                return false;
            }
            
            isRepeted[num % 10] = true;
            
            num = num/10;
        }
        
        return true;
    }

    public static void getTheNumbers(int a,int b){
        for(int i = a;i<=b;i++){
            if(isUnique(i)){
                System.out.println(i);
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        int a = 10;
        int b = 30;
        
        getTheNumbers(a,b);
		// your code goes here
	}
}

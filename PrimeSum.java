/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Find two prime numbers with given sum
// Input: n = 74
// Output: 3 71

/* Name of the class has to be "Main" only if the class is public. */
class PrimeSum
{
    static boolean[] isPrime;
    // returns whenther given value prime or not
    public static void buildArray(int n){
        isPrime[2] = false;
    
        for(int i=2;i*i<n;i++){
            for(int j = i+i;j<n;j+=i){
                isPrime[j] = false;
            }
        }
    }

    // print prime numer pair which has sum eqauls given n
    public static void getPrimes(int n){
        isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        buildArray(n+1);
        
        for(int i = 2;i<n;i++){
            if(isPrime[i] && isPrime[n-i]){
                System.out.println(i);
                System.out.println(n-i);
                break;
            }
        }
           
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n = 9990;
	    
	    getPrimes(n);
		// your code goes here
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// A Boolean Matrix Question
// Example 1
// The matrix
// 1 0
// 0 0
// should be changed to following
// 1 1
// 1 0


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void printArray(int[][] mat,Boolean[] rows,Boolean[] columns){
            for(int i = 0;i< mat.length;i++){
                for(int j = 0;j<mat[0].length;j++){
                     System.out.println(mat[i][j]);
                    if(mat[i][j] == 1){
                        rows[i] = true;
                        columns[j] = true;
                    }
                }
            }

            for(int i = 0;i< mat.length;i++){
                for(int j = 0;j<mat[0].length;j++){
                    if(rows[i] == true || columns[j] == true){
                        System.out.println(1);
                    } else {
                         System.out.println(0);
                    }
                }
            }

    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[][] mat = new int[][]{new int[]{ 1, 0},new int[]{0, 0}};
		Boolean[] rows = new Boolean[2];
		Boolean[] columns = new Boolean[2];
		Arrays.fill(rows,false);
		Arrays.fill(columns,false);
		printArray(mat,rows,columns);
		
	
	}
}

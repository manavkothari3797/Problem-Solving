/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// Check if a given Binary Tree is SumTree

//          26
//         /   \
//       10     3
//     /    \     \
//   4      6      3

// BinrayTree Class 
class BinrayTree{
    int data;
    BinrayTree left,right;
    
    BinrayTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class SumTreeChecker
{
    
    // Checks whether tree is sumtree or not
    public static boolean isSumTree(BinrayTree root){
        
        if(root == null){
           return true;
        }
        
        if(root.left == null && root.right == null){
            return true;
        }
        
        if(isSumTree(root.left) == true && isSumTree(root.right) == true){
            int ls = 0;
            
            if(root.left == null){
                ls = 0;
            }else if(root.left.right == null && root.left.left == null){
                ls = root.left.data;
            }else{
                ls = 2 * root.left.data;
            }
            
            int rs = 0;
            if(root.right == null){
                rs = 0;
            }if(root.right.right == null && root.right.left == null){
                rs = root.right.data;
            }else{
                rs = 2 * root.right.data;
            }
            
            return root.data == ls + rs ? true : false;
        }
        
        return false;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	   BinrayTree root = new BinrayTree(26);
	   root.left = new BinrayTree(10);
	   root.right = new BinrayTree(3);
	   root.left.left = new BinrayTree(4);
	   root.left.right = new BinrayTree(6);
	   root.right.right = new BinrayTree(3);
	   
	   if(isSumTree(root) == true){
	       System.out.println("Yes");
	   }else {
	       System.out.println("No");
	   }
	}
}

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
class SumTree
{
    
    // return the sum of child UnsupportedClassVersionError
    public static int getSum(BinrayTree node){
        if(node == null){
            return 0;
        }
        // sum of node + left child + right child
        return node.data + getSum(node.left) + getSum(node.right);
    }
    
    
    // Checks whether tree is sumtree or not
    public static boolean isSumTree(BinrayTree root){
        if(root == null)
            return true;
        
        if(root.data != getSum(root.left) + getSum(root.right)){
            return false;
        }
        
        return isSumTree(root.left) || isSumTree(root.right);
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

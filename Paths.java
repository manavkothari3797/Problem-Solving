/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// Given a binary tree, print all root-to-leaf paths

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Paths
{
    
    // function which will print path
    public static void printTheArr(int[] path,int n){
        for(int i = 0;i<n;i++){
            System.out.println(path[i]);
        }
    }
    
    public static void pathRecur(Node root,int[] path,int n){
        if(root == null){
            return;
        }
        
        path[n] = root.data;
        
        if(root.left == null && root.right == null ){
            printTheArr(path,n + 1);
        }
        
        pathRecur(root.left,path,n+1);
        pathRecur(root.right,path,n+1);
    };
    
    public static void printPaths(Node root){
        if(root == null){
            return;
        }
        int[] path = new int[100];
        pathRecur(root,path,0);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Node root= new Node(10);
	    root.left = new Node(8);
	    root.right = new Node(2);
	    root.left.left = new Node(3);
	    root.left.right = new Node(5);
	    root.right.left = new Node(2);
	    
		// your code goes here
	    printPaths(root);
	}
}

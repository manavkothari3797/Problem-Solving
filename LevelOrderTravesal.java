/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// bfs alogithem or level order tranvesel

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

class LevelOrderTravesal
{
    // bfs functions
    public static void bfs(Node root){
        if(root == null){
            System.out.println("No tree");
            return;
        }
        
        Queue<Node> q = new LinkedList();
        
        q.add(root);
        
        while(q.size() > 0){
            Node curNode = q.peek();
            
            System.out.println(curNode.data);
            
            q.remove();
            
            if(curNode.left != null){
                q.add(curNode.left);
            }
            
            if(curNode.right != null){
                q.add(curNode.right);
            }
        }
        
        return;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    
	    
	    bfs(root);
	}
}

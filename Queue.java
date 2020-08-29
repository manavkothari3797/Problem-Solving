/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.geeksforgeeks.org/queue-linked-list-implementation/

/* Name of the class has to be "Main" only if the class is public. */

// QNode 
class QNode{
    int data;
    QNode next;
    
    QNode(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue
{
    public static QNode front,rear;
    
    // add value in the queue
    public static void eq(int value){
        if(front == null && rear == null){
            QNode temp = new QNode(value);
            front = temp ;
            rear = temp;
            return;
        }
        
        QNode temp = new QNode(value);
       
        //  mapping new node to the next rear node;
        rear.next = temp;
        // moving rear pointer at the end;
        rear = rear.next;
        
        return;
    } 
    
    // remove value in the queue;
    public static void dq(){
        if(front == null){
            return;
        }
        
        // holding front in temp;
        QNode temp = front;
        
        // moving front to its next
        front = front.next;
        return;
    }
    
    // print the element of the queue
    public static void printQ(){
        QNode head = front;
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }   
        return;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		eq(1);
		eq(2);
		eq(3);
		printQ(); // 1,2,3
		dq();
		printQ(); // 2,3
	}
}

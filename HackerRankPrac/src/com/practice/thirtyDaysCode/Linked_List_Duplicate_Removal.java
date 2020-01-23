package com.practice.thirtyDaysCode;


import java.io.*;
import java.util.*;
class Linked_Node{
	int data;
	Linked_Node next;
	Linked_Node(int d){
        data=d;
        next=null;
    }
	
}
public class Linked_List_Duplicate_Removal
{
    
    public static Linked_Node removeDuplicates(Linked_Node head) {

        //Write your code here
        Linked_Node to_free;  

      if (head == null)  
          return null;  
    
      /* Traverse the list till last node */
      if (head.next != null)  
      {            
          /* Compare head node with next node */
          if (head.data == head.next.data)  
          {  
              to_free = head.next;  
              head.next = head.next.next; 
              removeDuplicates(head); 
          }  
         else 
          {  
              removeDuplicates(head.next); 
          }  
      }  
      return head;
    
    }

	 public static  Linked_Node insert(Linked_Node head,int data)
     {
        Linked_Node p=new Linked_Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Linked_Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Linked_Node head)
        {
              Linked_Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Linked_Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }
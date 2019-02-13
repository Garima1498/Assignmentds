/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import datastructure.node;


class Node{
    
    Node pre;
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.pre=null;
        this.next=null;
    }
}

class DoublyList{
    
    Node head;
    Node tail;
    
    public void traverse(){
    if(head == null){
    System.out.println("List is empty");
   }
   else{
    Node current;
    current = head;
    while(current != null){
     System.out.println(current.data);
     current = current.next;
     
    }
    
   }
}
    public void traverseReverse(){
    if(tail == null)
    {
    System.out.println("List is empty");
    }
    else{
        
        Node current;
        current = tail;
        
        while(current != null){
            System.out.println(current.data);
            current=current.pre;
        }
    }
    }
    public void insertbeg(int data){
        
        Node node=new Node(data);
        
        if(head == null){
            head=node;
            tail=node;
            
        }
        else{
            head.pre=node;
            node.next=head;
            head=node;
            
    }
    }
    public Node insertend(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.pre=tail;
            tail=node;
            
        }
        return head;
    }
    
    public void Insert(Node a , int pos , int data)
        {
            Node new_node = new Node(data);
            if(a == null)
            {
                return;
            }
            else
            {
                Node temp = head;
                for(int i=1  ; i<pos-1 ; i++)
                {
                    temp = temp.next;
                }
                Node curr = temp.next;
                new_node.next = curr;
                curr.pre = new_node;
                temp.next = new_node;  
                new_node.pre = temp;
            }
        }
    public void deleteBeg()
    {  
       if(head == null){
           System.out.println("list is empty");
           
       } 
       else{
           Node temp = head.next;
           temp.pre = null;
           head=temp;
    }
    }
    public void deleteEnd(){
        if(head==null)
        {
            return;
        }
       else{
           Node temp = tail.pre;
           temp.next = null;
           tail=temp;
    } 
    }
     public void delete(Node a , int pos)
        {
            if(head == null)
            {
                return;
            }
            else
            {
                Node temp = head;
                for(int i=1 ; i<pos-1 ; i++)
                {
                    temp = temp.next;
                }
                Node curr = temp.next.next;
                temp.next = curr;
                curr.pre = temp;
            }
        }
     public void display(Node node){
       if(node==null){
           return;
       }
       else{
           Node temp=head;
           while(temp != null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
   }
}
public class MyLinkedList {
    
    
    public static void main(String[] args) {
        
        DoublyList list=new DoublyList();
        
      /*list.insertbeg(10);
      list.insertbeg(20);
      list.insertbeg(30);
      list.insertbeg(40);
      list.insertbeg(50);
      */
      Node a=null;
      
      a=list.insertend(10);
      a=list.insertend(20);
      a=list.insertend(30);
      a=list.insertend(40);
     a= list.insertend(50);
      list.traverse();
      System.out.println("Traverse Reverse");
      list.traverseReverse();
     
      list.deleteBeg();
      System.out.println("delete begin");
      list.display(a);
      list.deleteEnd();
      System.out.println("delete End");
      list.display(a);
      list.Insert(a , 3 , 60);
      System.out.println("Insert At Any Position");
      list.display(a);
      list.delete( a ,3);
      System.out.println("Delete At Any Position");
      list.display(a);
    }
}

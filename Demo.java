/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;



/**
 *
 * @author HP
 */
class LinkedList{
   node head;
   node count;
   public node insertEnd(int data){
       node node = new node(data);
       if(head == null){
       head = node;
    }
       else{
       node current;
       current = head;
       while(current.next != null){
          current = current.next;
       }
       current.next = node;
       }
       return head;
   }
   public void insertBeg(int data){
    node Node = new node(data);
    if(head == null){
       head = Node;   
    }
    else{
    Node.next = head;
    head = Node;
    }
   }
   
   public void traverse(){
       
   if(head == null){
    System.out.println("List is empty");
   }
   else{
    node current;
    current = head;
    System.out.println("List elements are:");
    while(current != null){
     System.out.println(current.data);
     current = current.next;
     
    }
    
   }
    System.out.println("Recursion");
    traverseReverse(head); 
    alternate(head);
   } 
   
   public void traverseReverse(node Node){
       if(Node == null){
           return ;
          // System.out.println("List is empty");
       }
       traverseReverse(Node.next);
      
           System.out.println(Node.data);
      
   }
   
   public void alternate(node Node){
    if(Node == null){
    System.out.println("List is empty");
   }
   else{
    node current;
    current = head;
    System.out.println("Alternate elements are:");
    
    while(current != null){
        System.out.println(current.data);
        current = current.next;
         if(current != null){
            current = current.next; 
         }
    }
   }
   
   }
   
   public void atanypos(int data,int pos,node Node){
      node new_node=new node(data); 
       if(head==null){
           System.out.print("list is empty");
       }
       else{
    node current;
    current = head;
    System.out.println("List elements are:");
 for(int i=1;i<pos-1;i++){
     current=current.next;
 }
 node curr= current.next;
 new_node.next=curr;
 current.next=new_node;
       }
       
   }
   
   public void deleteBeg(){
       
       if(head == null){
           System.out.println("List is empty");
       }
       else{
           node temp=head;
           head=temp.next;
           temp.next=null;
       }
   }
   public void deleteEnd(){
       
       if(head == null){
           System.out.println("List is empty");
       }
       else{
           node current;
           node pre;
           pre=head;
           current=head;
           
           while(current.next != null){
               pre =current;
               current=current.next;   
           }
           if(pre == current)
           {
               head=null;
           }
           pre.next=null;
       }
   }
   
   public void deleteatanypos(){
       
   }
   public void printmiddle(){
      node fast=head;
      node slow=head;
      
      while(fast != null){
          fast =fast.next;
      
      if(fast != null){
          fast=fast.next;
          slow=slow.next;
      }
      }
      System.out.println(slow.data);
   }
   public void display(node Node){
       if(Node==null){
           return;
       }
       else{
           node temp=head;
           while(temp != null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
   }
}



public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       node a=null;
      a=list.insertEnd(10);
      a=list.insertEnd(20);
      a=list.insertEnd(30);
     a= list.insertEnd(40);
     a= list.insertEnd(50);
      /*list.insertBeg(10);
      list.insertBeg(20);
      list.insertBeg(30);
      list.insertBeg(40);
      list.insertBeg(50);*/
     
      list.traverse();
      System.out.print("Middle:-");
      
      
      list.printmiddle();
      list.atanypos(9,2,a);
      list.display(a);
      list.deleteBeg();
      System.out.println("delete beg:-");
      list.display(a);
      list.deleteEnd();
      System.out.println("delete end:-");
      list.display(a);
}
}

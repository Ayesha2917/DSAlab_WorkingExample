/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversesll;

class Node {
    int data;
    Node address;
    
    public Node(int data){
        this.data = data;
        this.address = null;
    }
}

public class ReverseSLL  {
    Node head,tail;
    public ReverseSLL(){
        head=tail=null;
    }
    
    public void add(int d){
        Node n = new Node(d);
        if(head==null){
            head=tail=n;
        }else{
            tail.address=n;
            tail=n;
        } 
    }
    
    public void PrintList(){
        Node current = head;
        while(current!=null){
        System.out.println(current.data);
        current=current.address;
        }
    }
    
    public void Reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next=current.address;
            current.address=previous;
            previous=current;
            current=next;
        }
      head=previous;  
    }
   
    
    public static void main(String[] args) {
        ReverseSLL SLL = new ReverseSLL();
        SLL.add(10);
        SLL.add(20);
        SLL.add(35);
        SLL.add(48);
        SLL.add(50);
        SLL.add(60);
        System.out.println("List: ");
        SLL.PrintList();
        
        
       
        SLL.Reverse();
        System.out.println("Reversed List:");
        SLL.PrintList(); 
        
        
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.middlenode;

class Node{
    int data;
    Node address;
    
    public Node(int data){
        this.data=data;
        this.address=null;
    }    
}

public class MiddleNode{
    Node head,tail;
    public MiddleNode(){
        head=tail=null;
    }
public void add(int d){
    Node n = new Node(d);
    if(head== null){
       head = tail=n; 
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

public void PrintMiddle(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node slow=head;
    Node fast=head;
    
    while(fast!=null && fast.address != null){
        slow=slow.address;
        fast=fast.address.address;
    }
    System.out.println("Middle Node: "+slow.data);
}

    public static void main(String[] args) {
        MiddleNode SLL = new MiddleNode();
        SLL.add(1);
        SLL.add(2);
        SLL.add(3);
        SLL.add(4);
        SLL.add(5);
        System.out.println("List:");
        SLL.PrintList();    
        SLL.PrintMiddle();
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.removingduplicates;

class Node{
    int data;
    Node address;
    
    public Node(int data){
        this.data=data;
        this.address=null;
    }
}

public class RemovingDuplicates  {
    Node head,tail;
    public RemovingDuplicates(){
        head=tail=null;
    }

public void add(int d){
    Node n = new Node(d);
    if(head == null){
        head=tail=n;
    }else{
        tail.address=n;
        tail=n;
    }
}

public void printList(){
    Node current = head;
    while(current!=null){
        System.out.println(current.data);
        current = current.address;
    }
}

public void removeDuplicates(){
    Node current = head;
    while(current!=null&&current.address!=null){
        if(current.data==current.address.data){
            current.address=current.address.address;
        }else{
            current=current.address;
        }
    }
}
    
    public static void main(String[] args) {
        RemovingDuplicates SLL = new RemovingDuplicates ();
        SLL.add(2);
        SLL.add(2);
        SLL.add(2);
        SLL.add(3);
        SLL.add(3);
        SLL.add(5);
        SLL.add(6);
        SLL.add(7);
        SLL.add(8);
        SLL.add(8);
        System.out.println("List");
        SLL.printList();    
        
        SLL.removeDuplicates(); 

        System.out.println("List after removing duplicates:");
        SLL.printList(); 
        
    }
}



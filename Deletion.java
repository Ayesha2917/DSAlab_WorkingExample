/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deletion;

class Node{
    int data;
    Node address;
    
    public Node(int data){
        this.data=data;
        this.address=null;
    }
}

public class Deletion{
    Node head,tail;
    
    public Deletion(){
        head=tail=null;
    }

    public void add(int d){
        Node n =new Node(d);
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
    
    public void deleteList() {
        head = null;
        System.out.println("The linked list has been deleted.");
    }
        
    public static void main(String[] args) {
        Deletion  SLL = new Deletion ();
        SLL.add(1);
        SLL.add(2);
        SLL.add(3);
        SLL.add(4);
        SLL.add(5);
        SLL.add(6);
        System.out.println("List");
        SLL.PrintList();
        SLL.deleteList();
       
    }
}


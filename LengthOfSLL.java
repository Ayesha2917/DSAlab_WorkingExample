/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lengthofsll;
class Node{
    int data;
    Node address;
    
    public Node(int data){
        this.data=data;
        this.address=null;
    }
}

public class LengthOfSLL{
    Node head,tail;
    public LengthOfSLL(){
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
    
    public int findLength(){
        Node current=head;
        int length=0;
        while(current!=null){
            length++;
            current=current.address;
        }
        return length;
    }
    
    public void PrintList(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.address;
        }
    }
    
    public static void main(String[] args) {
        LengthOfSLL Sll = new LengthOfSLL();
        Sll.add(11);
        Sll.add(22);
        Sll.add(33);
        Sll.add(44);
        Sll.add(55);
        Sll.add(66);
        System.out.println("List:");
        Sll.PrintList();
        System.out.println("Length of singly linked list: "+Sll.findLength());  
    }
}

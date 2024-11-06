/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist;


class Nodee {
    int data;
    Nodee address; 

    public Nodee(int data) {
        this.data = data;
        this.address = null; 
    }
}

public class LinkedList{
Nodee head,tail;
int size;
public LinkedList(){
head=tail=null;
size =0;
}
public void add(int d){
    Nodee n = new Nodee(d);
    if(head ==null){
        head=tail=n;
    }else{
        tail.address=n;
        tail=n;
    }
    size++;
}
//public int getsize(){
//    return size;
//}
public void printList(){
    Nodee current = head;
    while (current != null){
        System.out.println(current.data);
        current = current.address;
    }
}
    public static void main(String[] args) {
//        Nodee node1 = new Nodee(1); 
//        Nodee node2 = new Nodee(2);
//        Nodee node3 = new Nodee(3);
//        Nodee node4 = new Nodee(4);
//        
//        node1.address = node2; 
//        node2.address = node3; 
//        node3.address = node4;
//        
//        node4.address = null; 
//        System.out.println(node1.data); 
//        System.out.println(node2.data);
//        System.out.println(node3.data);
//        System.out.println(node4.data);
LinkedList list = new LinkedList();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.printList();
System.out.println(list.size);
    }
}

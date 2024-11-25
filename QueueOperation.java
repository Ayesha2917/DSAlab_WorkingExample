/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueoperation;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    private Node front;
    private Node rear;
    private int size;
    
    public Queue(){
        front=null;
        rear=null;
        size=0;
    }
    
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(rear==null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int value = front.data;
        front = front.next;
        if(front==null){
            rear = null;
        }
        size--;
        return value;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int size(){
        return size;
    }
    
    public void reverseFirstKElements(int k){
        if(k<=0 || k>size){
            return;
        }
        Node current =  front;
        Node prev = null;
        Node next = null;
        
        for(int i=0;i<k;i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(front!=null){
            front.next=current;
        }
        front = prev;
        if(current == null){
            rear = front;
        }
    }
    
    public int Minimum(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int min = Integer.MAX_VALUE;
        Node current = front;
        while(current!=null){
            if(current.data<min){
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
    
    public void display(){
        Node current = front;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
public class QueueOperation {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(71);
        queue.enqueue(21);
        queue.enqueue(31);
        queue.enqueue(81);
        queue.enqueue(51);
        queue.enqueue(61);
        queue.enqueue(11);
        
        System.out.println("Orignal Queue: ");
        queue.display();
        
        queue.reverseFirstKElements(4);
        System.out.println("Queue after reversing first 4 elements: ");
        queue.display();
        
        int min = queue.Minimum();
        System.out.println("Minimum element in the queue: "+min);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mergedsll;

class Node{
    int data;
    Node address;
    
    public Node(int data){
        this.data=data;
        this.address=null;
    }
}

public class MergedSLL{
    Node head,tail;
    public MergedSLL(){
        head=tail=null;
    }
    
    public void add(int d){
        Node n = new Node(d);
        if (head==null){
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
    
    public static MergedSLL merge(MergedSLL list1, MergedSLL list2){
        MergedSLL mergedList = new MergedSLL();//new merged list
        Node current1 = list1.head;//initializatiom
        Node current2 = list2.head;
        while(current1!=null && current2!=null){//jab tak dono kay heads null nhi hai 
            if(current1.data<=current2.data){
                mergedList.add(current1.data);
                current1 = current1.address;
            }else{
                    mergedList.add(current2.data);
                    current2 = current2.address;
        }
            }
        // If there are remaining nodes in list1
        while(current1!=null){
            mergedList.add(current1.data);
            current1 = current1.address;
        }
        // If there are remaining nodes in list2
        while (current2 != null){
            mergedList.add(current2.data);
            current2 = current2.address;
        }
        return mergedList;
    }

    
    public static void main(String[] args) {
        MergedSLL SLL = new MergedSLL ();
        SLL.add(1);
        SLL.add(2);
        SLL.add(3);
        SLL.add(9);
        System.out.println("List 1:");
        SLL.PrintList();
        
        MergedSLL SLL1 = new MergedSLL ();
        SLL1.add(5);
        SLL1.add(6);
        SLL1.add(7);
        SLL1.add(8);
        System.out.println("List 2:");
        SLL1.PrintList();
        
        MergedSLL mergedList = MergedSLL.merge(SLL, SLL1); // Merge the two lists
        System.out.println("Merged List:");
        mergedList.PrintList();
        
    }
}



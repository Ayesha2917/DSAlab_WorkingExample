/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.insertattheend;
import java.util.Arrays;


class main{
    static int Element(int arr[], int n, int key,int capacity){
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = key;
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
        return n + 1; 
    }  
    }
   
public class InsertAtTheEnd {

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0]=12;
        arr[1]=16;
        arr[2]=20;
        arr[3]=40;
        arr[4]=50;
        arr[5]=70;
        int capacity = 20;
        int n=6;
        int i,key =26;
        System.out.println("Before Insertion: ");
        for(i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            n=main.Element(arr, n, key,capacity);
            System.out.println("\n After Insertion: ");
            for(i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortcolors_leetcode;

import java.util.Scanner;
public class SortColors_LeetCode {
    public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 =0;
        for (int num:nums){
            if(num==0){
                count0++;
            }else if(num == 1){
                count1++;
            }else if(num == 2){
                count2++;
            }
            else{
                System.out.println("Invalid Input");
                break;
            }
        }
        int i = 0;
        while(count0>0){
            nums[i++]=0;
            count0--;
        }
        while(count1>0){
            nums[i++]=1;
            count1--;
        }
        while(count2>0){
            nums[i++]=2;
            count2--;
        }
    }
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements(0 for red, 1 for white and 2 for blue): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }
}
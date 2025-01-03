/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twosum_leetcode;

import java.util.Scanner;
public class TwoSum_LeetCode {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            return;
        }
        int[] nums = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
}

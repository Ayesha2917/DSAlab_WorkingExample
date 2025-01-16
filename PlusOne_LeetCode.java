/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plusone_leetcode;


import java.util.Scanner;
import java.util.Arrays;

public class PlusOne_LeetCode {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlusOne_LeetCode solution = new PlusOne_LeetCode();
        System.out.print("Enter the digits of the number (space separated): ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] digits = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            digits[i] = Integer.parseInt(inputArray[i]);
        }
        int[] result = solution.plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}


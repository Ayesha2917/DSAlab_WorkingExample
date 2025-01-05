/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromenumber_leetcode;

import java.util.Scanner;
public class PalindromeNumber_Leetcode {
    public static boolean isPalindrome(int x) {
        int orignalNumber = x;
        int reversedNumber = 0;
        while(x>0){
            int digit = x%10;
            reversedNumber = reversedNumber * 10 + digit;
            x/=10;
        }
        return orignalNumber == reversedNumber;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

    }
}

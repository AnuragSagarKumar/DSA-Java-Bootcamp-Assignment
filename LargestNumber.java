package com.assignment;
// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " Number is largest");
        } else {
            System.out.println(num2 + " Number is largest");
        }
    }
}

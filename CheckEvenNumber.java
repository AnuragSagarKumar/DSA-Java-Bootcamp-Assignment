package com.assignment;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class CheckEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd");
        }
    }
}

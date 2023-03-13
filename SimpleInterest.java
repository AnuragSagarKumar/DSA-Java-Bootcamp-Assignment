package com.assignment;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float principal = input.nextFloat();
        float time = input.nextFloat();
        float rate = input.nextFloat();

        float interest = (principal * time * rate) / 100;

        System.out.println("Total Interest is: " + interest);
    }
}

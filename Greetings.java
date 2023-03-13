package com.assignment;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name);
    }
}

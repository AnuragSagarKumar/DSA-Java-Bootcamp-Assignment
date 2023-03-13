package com.assignment;
// Input currency in rupees and output in USD.
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter currency in INR: ");
        float inr = input.nextFloat();

        float usd = inr / (82.22f);

        System.out.println(inr + " INR is equall to " + usd + " USD");
    }
}

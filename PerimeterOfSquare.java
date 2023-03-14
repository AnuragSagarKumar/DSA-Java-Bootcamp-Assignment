package com.assignments;
// 12 Perimeter Of Square
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int area = 4 * a;

        System.out.println("Perimeter Of Square: " + area);
    }
}

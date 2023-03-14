package com.assignments;
// 09 Perimeter Of Equilateral Triangle
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int area = 3 * a;

        System.out.println("Perimeter Of Equilateral Triangle: " + area);
    }
}

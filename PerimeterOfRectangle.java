package com.assignments;
// 11 Perimeter Of Rectangle
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int b = input.nextInt();

        int area = 2 * (l + b);

        System.out.println("Perimeter Of Rectangle: " + area);
    }
}

package com.assignments;
// 13 Perimeter Of Rhombus
import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int area = 4 * a;

        System.out.println("Perimeter Of Rhombus: " + area);
    }
}

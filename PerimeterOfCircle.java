package com.assignments;
// 08 Perimeter Of Circle
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float R = input.nextFloat();

        float area = 2 * (22/7f) * R;

        System.out.println("Perimeter Of Circle: " + area);
    }
}

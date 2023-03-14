package com.assignments;
// 19 Curved Surface Area Of Cylinder
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();

        float area = 2 * (22/7f) * radius * height;

        System.out.println("Curved Surface Area Of Cylinder: " + area);
    }
}

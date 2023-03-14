package com.assignments;
// 20 Total Surface Area Of Cube
import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int area = input.nextInt();

        int totalArea = 6 * area * area;

        System.out.println("Total Surface Area Of Cube: " + totalArea);
    }
}

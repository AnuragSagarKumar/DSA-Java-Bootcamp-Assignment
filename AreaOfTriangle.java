package com.assignments;
// 02 Area Of Rectangle Program
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();

        float area = (base * height) / 2; // Area of Triangle: 1/2 * base * height

        System.out.println("Area of Triangle: " + area);
    }
}

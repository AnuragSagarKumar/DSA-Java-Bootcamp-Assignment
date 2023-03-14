package com.assignments;

import java.util.Scanner;
// 06 Area Of Rhombus
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();

        float area = base * height;

        System.out.println("Area Of Rhombus: " + area);
    }
}

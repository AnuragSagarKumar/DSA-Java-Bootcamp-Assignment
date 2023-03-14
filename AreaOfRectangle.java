package com.assignments;
// 03 Area Of Rectangle Program
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();

        int area = base * height;

        System.out.println("Area Of Rectangle: " + area);
    }
}

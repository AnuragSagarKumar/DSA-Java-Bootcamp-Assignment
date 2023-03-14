package com.assignments;
// 01 Area Of Circle Java Program
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        input.close();

        float area = (22/7f) * R * R;

        System.out.println("Area of circle is: " + area);
    }
}

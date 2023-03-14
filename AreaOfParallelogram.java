package com.assignments;
// 05 Area Of Parallelogram
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();

        int area = base * height; //Area Of Parallelogram: base * height

        System.out.println("Area Of Parallelogram: " + area);
    }
}

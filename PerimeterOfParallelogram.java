package com.assignments;
// 10 Perimeter Of Parallelogram
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int area = 2 * (a + b);

        System.out.println("Perimeter Of Parallelogram: " + area);
    }
}

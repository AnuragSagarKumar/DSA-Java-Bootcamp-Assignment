package com.assignments;
// 18 Volume Of Pyramid
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();

        // To find the volume of a pyramid, We will use the formula – V = ⅓ A H
        // As the base of the pyramid is a square, the area of the base is a2

        float area = base * base;

        // Volume of Pyramid: V = ⅓ A × H

        float volume = (1/3f) * area * height;

        System.out.println("Volume Of Pyramid: " + volume);
    }
}

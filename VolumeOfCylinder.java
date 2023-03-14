package com.assignments;
// 16 Volume Of Cylinder
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();

        float volume = (22/7f) * radius * radius * height;

        System.out.println("Volume Of Cylinder: " + volume);
    }
}
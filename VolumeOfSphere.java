package com.assignments;
// 17 Volume Of Sphere
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();

        float volume = (4/3f) * (22/7f) * radius * radius * radius; // Both are same
//         float volume = (float) ((4/3f) * (22/7f) * Math.pow(radius, 3));

        System.out.println("Volume Of Sphere: " + volume);
    }
}
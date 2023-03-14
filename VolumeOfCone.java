package com.assignments;
// 14 Volume Of Cone
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float height = input.nextFloat();

        float volume = (1/3f) * (22/7f) * (radius * radius) * height;

        System.out.println("Volume Of Cone: " + volume);
    }
}

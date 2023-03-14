package com.assignments;
// 15 Volume Of Prism
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        int length = input.nextInt();

        float base_area = (1/2f) * base * height; // Area of triangle

        float volume = base_area * length; // The volume of a Prism = Base Area × Length

        System.out.println("The volume of a Prism: " + volume);
    }
}

package org.TimeCal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculateTime cal = new CalculateTime();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        double km = in.nextDouble();

        System.out.println("Enter speed in km/h: ");
        double speed = in.nextDouble();

        System.out.println("Time required: " + cal.calculateTime(km, speed) + " hours");
    }
}

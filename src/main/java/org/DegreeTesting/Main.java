package org.DegreeTesting;


import org.DegreeTesting.Resources.Degree;
import org.DegreeTesting.Resources.DegreeGet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DegreeGet degreeGet = new DegreeGet();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What degree would you like to pursue? (bsc, msc, phd)");

        String userInput = scanner.nextLine().trim().toLowerCase();

        Degree selectedDegree = degreeGet.getDegreeByName(userInput);

        if (selectedDegree != null) {
            System.out.println("The " + selectedDegree.getDegreeName().toUpperCase() + " degree takes " + selectedDegree.getYears() + " years to complete.");
        } else {
            System.out.println("The Degree was not found!");
        }
    }
}
package org.DegreeTesting.Resources;

import java.util.ArrayList;

public class DegreeGet {
    private ArrayList<Degree> degreeList = new ArrayList<Degree>();

    public DegreeGet() {
        degreeList.add(new Degree("bsc", 4));
        degreeList.add(new Degree("phd", 7));
        degreeList.add(new Degree("msc", 6));
    }

    public ArrayList<Degree> getDegreeList() {
        return degreeList;
    }

    public Degree getDegreeByName(String name) {
        for (Degree degree : degreeList) {
            if (degree.getDegreeName().equalsIgnoreCase(name)) {
                return degree;
            }
        }
        return null; // Return null if no matching degree is found
    }
}

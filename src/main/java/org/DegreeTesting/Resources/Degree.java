package org.DegreeTesting.Resources;

public class Degree {
    private String degreeName;
    private Integer years;

    public Degree(String degreeName, Integer years) {
        this.degreeName = degreeName;
        this.years = years;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public Integer getYears() {
        return years;
    }
}

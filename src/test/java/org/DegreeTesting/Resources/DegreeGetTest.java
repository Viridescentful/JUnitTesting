package org.DegreeTesting.Resources;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DegreeGetTest {

    @Test
    void getDegreeByName() {
        DegreeGet degreeGet = new DegreeGet();
        Degree degree = degreeGet.getDegreeByName("bsc");
        assertNotNull(degree);
    }

    @Test
    void getDegreeByNameNotFound() {
        DegreeGet degreeGet = new DegreeGet();
        Degree degree = degreeGet.getDegreeByName("epicgalaxyomegadegree");
        assertNull(degree);
    }

    @Test
    void getDegreeList() {
        DegreeGet degreeGet = new DegreeGet();
        assertEquals(3, degreeGet.getDegreeList().size());
    }

    @Test
    void bscDegree() {
        DegreeGet degreeGet = new DegreeGet();
        Degree degree = degreeGet.getDegreeByName("bsc");
        assertNotNull(degree);

        assertEquals("bsc", degree.getDegreeName());
        assertEquals(4, degree.getYears());
    }
}
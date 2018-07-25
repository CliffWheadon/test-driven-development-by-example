package com.cliffwheadon.tddbyexample.triangle;

import org.junit.Test;

import static com.cliffwheadon.tddbyexample.triangle.Triangle.Type.*;


public class TriangleTests {
    @Test public void testEquilateral() {
        assert(EQUILATERAL == new Triangle(1,1,1).getType());
    }

    @Test public void testIsoceles() {
        assert(ISOCELES == new Triangle(1,1,2).getType());
        assert(ISOCELES == new Triangle(1,2,2).getType());
        assert(ISOCELES == new Triangle(1,2,1).getType());
    }

    @Test public void testScalene() {
        assert(SCALENE == new Triangle(1,2,3).getType());
    }

    @Test(expected = NotWellFormedException.class)
    public void testIrrational() {
        new Triangle(1,2,5);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNegativeSide() {
        new Triangle(-1, 1,1);
    }

    @Test(expected = NotWellFormedException.class)
    public void testZeroSide() {
        new Triangle(0,1,1);
    }
}

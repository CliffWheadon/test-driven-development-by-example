package com.cliffwheadon.tddbyexample.triangle;

import org.junit.Test;


public class TriangleTests {
    @Test public void testEquilateral() {
        assert(1 == new Triangle(1,1,1).getType());
    }

    @Test public void testIsoceles() {
        assert(2 == new Triangle(1,1,2).getType());
        assert(2 == new Triangle(1,2,2).getType());
        assert(2 == new Triangle(1,2,1).getType());
    }

    @Test public void testScalene() {
        assert(3 == new Triangle(1,2,3).getType());
    }

    @Test(expected = NotWellFormedException.class)
    public void testIrrational() {
        new Triangle(1,2,5);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNegativeOne() {
        new Triangle(-1, 1,1);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNegativeTwo() {
        new Triangle(1, -1,1);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNegativeThree() {
        new Triangle(1, 1,-1);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNotWellFormedSideOne() {
        new Triangle(0,1,1);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNotWellFormedSideTwo() {
        new Triangle(1,0,1);
    }

    @Test(expected = NotWellFormedException.class)
    public void testNotWellFormedSideThree() {
        new Triangle(1,1,0);
    }
}

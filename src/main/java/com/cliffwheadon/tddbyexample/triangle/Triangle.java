package com.cliffwheadon.tddbyexample.triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Triangle {
    enum Type {
        EQUILATERAL, ISOSCELES, SCALENE
    }

    private List<Integer> sides = new ArrayList<>();

    Triangle(int sideOneLength, int sideTwoLength, int sideThreeLength) {
        sides.add(sideOneLength);
        sides.add(sideTwoLength);
        sides.add(sideThreeLength);

        Collections.sort(sides);

        if (sides.get(0) <= 0) {
            throw new NotWellFormedException();
        }

        if (sides.get(0) + sides.get(1) < sides.get(2)) {
            throw new NotWellFormedException();
        }
    }

    Type getType() {
        return Type.values()[new HashSet<>(sides).size() - 1];
    }

    int getPerimeter() {
        return sides.stream().reduce(0, Integer::sum);
    }
}

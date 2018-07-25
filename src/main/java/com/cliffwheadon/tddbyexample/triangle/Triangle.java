package com.cliffwheadon.tddbyexample.triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Triangle {
    private List<Integer> sides = new ArrayList<>();

    public Triangle(int sideOneLength, int sideTwoLength, int sideThreeLength) {
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

    public int getType() {
        return new HashSet<>(sides).size();
    }
}

package com.Learn.Menu.AirlineInfo;

import com.Learn.Planes.Plane;

import java.util.Comparator;

public class SortByDis implements Comparator<Plane> {

    public int compare(Plane o1, Plane o2) {
        return o1.getDistance() - o2.getDistance();
    }
}

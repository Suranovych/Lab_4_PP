package com.Learn.Planes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {
    Airline test = new Airline();
    ArrayList<Plane> plane = new ArrayList<Plane>();
    @BeforeEach
    void setUp() {
        Plane v1 = new Airfrieghter("rice","Boeing", "f150", 145, 15, 15000, 1000000);
        Plane v2 = new Passenger(15,"Mriya", "v12", 120, 70, 6000, 10000);
        Plane v3 = new Priv("Musk","Ferrari", "458", 189, 10, 1500, 10000);
        Plane v4 = new Priv("Bezos","Boeing", "f120", 135, 9, 1500, 12000);
        ArrayList<Plane> p1 = new ArrayList<Plane>();
        ArrayList<Plane> p2 = new ArrayList<Plane>();
        p1.add(v1);
        p1.add(v2);
        p1.add(v3);
        p1.add(v4);
        p2.add(v1);
        p2.add(v2);
        p2.add(v3);
        p2.add(v4);
        v1.getInfo();
        v2.getInfo();
        v3.getInfo();
        v4.getInfo();
    }

    @Test
    void addPlane() {
        Plane v5 = new Priv("Gates","Boeing", "f110", 195, 6, 1200, 9000);
        test.addPlane(v5);
    }

    @Test
    void removePlane() {
        test.removePlane(1);
    }

    @Test
    void getPlanes() {
        test.getPlanes();
    }
}
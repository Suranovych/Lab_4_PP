package com.Learn.Menu.AirlineInfo;

import com.Learn.Command;
import com.Learn.Planes.Airline;

import java.util.Scanner;

public class AirlineInfo {
    private final Command findByPetrol;
    private final Command sortPlanesByDistance;


    public AirlineInfo(Airline base) {
        this.findByPetrol = new FindPlaneByPetrol(base);
        this.sortPlanesByDistance = new SortPlanesByDistance(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - Find plane by petrol\n"
                + "\t2 - Sort planes by distance\n"
                + "\t3 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                findByPetrol();
                break;
            case 2:
                sortByDistance();
                break;
            default:
                return false;
        }
        return true;
    }

    private void findByPetrol() { findByPetrol.execute(); }
    private void sortByDistance() { sortPlanesByDistance.execute(); }

}
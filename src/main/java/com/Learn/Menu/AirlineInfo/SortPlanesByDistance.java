package com.Learn.Menu.AirlineInfo;

import com.Learn.Command;
import com.Learn.Planes.Airline;
import com.Learn.Planes.Plane;

import java.util.Collections;

public class SortPlanesByDistance implements Command {
    Airline base;

    public SortPlanesByDistance(Airline base){
        this.base = base;
    }


    public void execute() {
        Collections.sort(base.getPlanes(),new SortByDis());
        for(Plane a : base.getPlanes()){
            System.out.println("Planes:");
            a.getInfo();
        }
    }

}

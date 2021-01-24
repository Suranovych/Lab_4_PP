package com.Learn.Menu.ChangePlanes;

import com.Learn.Command;
import com.Learn.Planes.Airline;
import com.Learn.Planes.Plane;

public class ShowPlanes implements Command {
    Airline base;

    public ShowPlanes(Airline base){
        this.base = base;
    }

    @Override
    public void execute() {
        for (Plane a : base.getPlanes()) {
            a.getInfo();
        }
    }
}

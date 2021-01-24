package com.Learn.Menu.CalculateCommands;

import com.Learn.Command;
import com.Learn.Planes.Airline;
import com.Learn.Planes.Plane;

public class CalculateTotalLoadcap implements Command {
    Airline base;
    public CalculateTotalLoadcap(Airline base){
        this.base = base;
    }
    @Override
    public void execute() {
        int res = 0;
        for (Plane a : base.getPlanes()) {
            res += a.getLoadcap();
        }
        System.out.println("Total loadcapacity is - "+ res);
    }
}

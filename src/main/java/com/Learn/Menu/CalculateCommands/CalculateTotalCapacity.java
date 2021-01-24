package com.Learn.Menu.CalculateCommands;

import com.Learn.Command;
import com.Learn.Planes.Airline;
import com.Learn.Planes.Plane;

public class CalculateTotalCapacity implements Command {
    Airline base;
    public CalculateTotalCapacity(Airline base){
        this.base = base;
    }

    @Override
    public void execute() {
        int res = 0;
        for (Plane a : base.getPlanes()) {
            res += a.getCapacity();
        }
        System.out.println("Total capacity is - "+ res);
    }
}

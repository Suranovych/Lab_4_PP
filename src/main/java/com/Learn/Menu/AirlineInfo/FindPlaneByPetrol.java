package com.Learn.Menu.AirlineInfo;

import com.Learn.Command;
import com.Learn.Planes.Airline;
import com.Learn.Planes.Plane;

import java.util.Scanner;

public class FindPlaneByPetrol implements Command {

    Airline base;

    public FindPlaneByPetrol(Airline base){
        this.base = base;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter min of petrol");
        int min = in.nextInt();
        System.out.println("Enter max of petrol");
        int max = in.nextInt();
        for (Plane a : base.getPlanes()) {
            if((a.getPetrol()>= min) && (a.getPetrol()<=max)){
                System.out.println("Info about this plane:");
                a.getInfo();
                break;
            }
        }

    }
}


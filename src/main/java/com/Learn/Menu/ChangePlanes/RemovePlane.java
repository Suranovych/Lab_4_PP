package com.Learn.Menu.ChangePlanes;

import com.Learn.Command;
import com.Learn.Planes.Airline;

import java.util.Scanner;

public class RemovePlane implements Command {
    Airline base;

    public RemovePlane(Airline base){
        this.base = base;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter index element to remove");
        int i = in.nextInt();
        base.removePlane(i);
    }
}

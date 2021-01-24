package com.Learn.Menu.CalculateCommands;

import com.Learn.Command;
import com.Learn.Planes.Airline;

import java.util.Scanner;

public class CalculateCommands {
    private final Command calculateCapacity;
    private final Command calculateLoadcap;

    public CalculateCommands(Airline base){
        this.calculateCapacity = new CalculateTotalCapacity(base);
        this.calculateLoadcap = new CalculateTotalLoadcap(base);
    }
    public boolean chooseCommand() {
        System.out.print("\t1 - Calculate total Capacity\n"
                + "\t2 - Calculate Total Loadcap\n"
                + "\t3 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                calculateCapacity();
                break;
            case 2:
                calculateLoadcap();
                break;
            default:
                return false;
        }
        return true;
    }

    private void calculateCapacity() { calculateCapacity.execute(); }
    private void calculateLoadcap() { calculateLoadcap.execute(); }
}
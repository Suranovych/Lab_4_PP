package com.Learn.Menu.ChangePlanes;

import com.Learn.Command;
import com.Learn.Planes.Airline;

import java.util.Scanner;

public class ChangePlanes {
    private final Command addPlane;
    private final Command removePlane;
    private final Command showPlanes;

    public ChangePlanes(Airline base){
        this.addPlane = new AddPlane(base);
        this.removePlane = new RemovePlane(base);
        this.showPlanes = new ShowPlanes(base);
    }
    public boolean chooseCommand() {
        System.out.print("\t1 - Add Plane\n"
                + "\t2 - Remove Plane\n"
                + "\t3 - Show Planes\n"
                + "\t4 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                addPlane();
                break;
            case 2:
                removePlane();
                break;
            case 3:
                showPlanes();
                break;
            default:
                return false;
        }
        return true;
    }

    private void addPlane() { addPlane.execute(); }
    private void removePlane() { removePlane.execute(); }
    private void showPlanes() { showPlanes.execute(); }
}

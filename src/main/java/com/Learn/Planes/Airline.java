package com.Learn.Planes;

import com.Learn.Planes.Plane;

import java.io.Serializable;
import java.util.ArrayList;

public class Airline implements Serializable {
    public ArrayList<Plane> planes = new ArrayList<Plane>();

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }
    public void removePlane(int i){
        if (planes.isEmpty()){}
        else  planes.remove(i-1);
    }
    public ArrayList<Plane> getPlanes(){
        return planes;
    }
}

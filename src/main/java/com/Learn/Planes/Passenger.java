package com.Learn.Planes;

import java.io.Serializable;

public class Passenger extends Plane implements Serializable {
    private int quantserve;

    public Passenger(int quantserve, String firm, String model, double petrol, int capacity, int loadcap, int distance){
        super(firm, model, petrol, capacity, loadcap, distance);
        this.quantserve = quantserve;
    }
    @Override
    public void getInfo(){
        System.out.println(getFirm()+" "+getModel()+"\n Quantity of serve - " +getQuantserve()+"\n Petrol - "+ getPetrol()+"\n Capacity - "+ getCapacity()+ "\n Loadcap - "+ getLoadcap()+ "\n Distance - "+ getDistance());
    }
    public int getQuantserve() {
        return quantserve;
    }
}

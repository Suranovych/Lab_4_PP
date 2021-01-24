package com.Learn.Planes;

import java.io.Serializable;

public class Priv extends Plane implements Serializable {
    private String owner;

    public Priv(String owner, String firm, String model, double petrol, int capacity, int loadcap, int distance){
        super(firm, model, petrol, capacity, loadcap, distance);
        this.owner = owner;
    }
    @Override
    public void getInfo(){
        System.out.println(getFirm()+" "+getModel()+"\n Owner - " +getOwner()+"\n Petrol - "+ getPetrol()+"\n Capacity - "+ getCapacity()+ "\n Loadcap - "+ getLoadcap()+ "\n Distance - "+ getDistance());
    }

    public String getOwner() {
        return owner;
    }
}

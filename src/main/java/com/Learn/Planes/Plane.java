package com.Learn.Planes;

public abstract class Plane {
    private String firm;
    private String model;
    private double petrol;
    private int capacity;
    private int loadcap;
    private int distance;

    public Plane(String firm, String model, double petrol, int capacity, int loadcap, int distance){
        this.firm = firm;
        this.model = model;
        this.petrol = petrol;
        this.capacity = capacity;
        this.loadcap = loadcap;
        this.distance = distance;
    }
    public abstract void getInfo();

    public String getFirm() {
        return firm;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLoadcap() {
        return loadcap;
    }

    public int getDistance() {
        return distance;
    }

    public double getPetrol() {
        return petrol;
    }
}

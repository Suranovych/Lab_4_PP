package com.Learn.Planes;

import java.io.Serializable;

public class Airfrieghter extends Plane implements Serializable {
    private String content;

    public  Airfrieghter(String content, String firm, String model, double petrol, int capacity, int loadcap, int distance){
            super(firm, model, petrol, capacity, loadcap, distance);
            this.content = content;
    }
    @Override
    public void getInfo(){
        System.out.println(getFirm()+" "+getModel()+"\n Content - " +getContent()+"\n Petrol - "+ getPetrol()+"\n Capacity - "+ getCapacity()+ "\n Loadcap - "+ getLoadcap()+ "\n Distance - "+ getDistance());
    }

    public String getContent() {
        return content;
    }
}

package com.Learn.Menu.ChangePlanes;

import com.Learn.Command;
import com.Learn.Planes.*;

import java.util.Scanner;

public class AddPlane implements Command {
    Airline base;
    public AddPlane(Airline base){
        this.base = base;
    }

    
    public void execute() {
        Plane plane;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter firm of plane");
        String i1 = in.nextLine();
        System.out.println("Enter model of plane");
        String i2 = in.nextLine();
        System.out.println("Enter quantity of petrol");
        double i3 = in.nextDouble();
        System.out.println("Enter capacity");
        int i4 = in.nextInt();
        System.out.println("Enter loadcapacity");
        int i5 = in.nextInt();
        System.out.println("Enter distance");
        int i6 = in.nextInt();
        System.out.println("Choose the type of plane:"+"\n1.Airfrieghter"+"\n2.Passenger"+"\n3.Private");
        switch (in.nextInt()) {
            case 1:
                System.out.println("Enter content of plane");
                String cont = in.next();
                plane = new Airfrieghter(cont, i1, i2, i3, i4, i5, i6);
                break;
            case 2:
                System.out.println("Enter quantity of personal");
                int serve = in.nextInt();
                plane = new Passenger(serve, i1, i2, i3, i4, i5, i6);
                break;
            default:
                System.out.println("Enter owner of plane");
                String own = in.next();
                plane = new Priv(own, i1, i2, i3, i4, i5, i6);
        }
        base.addPlane(plane);
    }
}

package com.Learn;

import com.Learn.Menu.AirlineInfo.AirlineInfo;
import com.Learn.Menu.CalculateCommands.CalculateCommands;
import com.Learn.Menu.ChangePlanes.ChangePlanes;
import com.Learn.Planes.Airline;

import java.util.Scanner;

public class Accumulator {
    private final AirlineInfo info;
    private final CalculateCommands calculate;
    private final ChangePlanes change;


    public Accumulator(Airline base) {
        info = new AirlineInfo(base);
        calculate = new CalculateCommands(base);
        change = new ChangePlanes(base);
    }

    public boolean chooseCommandType() {
        System.out.print("1 - Info about planes \n"
                + "2 - Calculate commands\n"
                + "3 - Change planes\n"
                + "4 - exit\n");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
                info();
                break;
            case 2:
                calculate();
                break;
            case 3:
                change();
                break;
            default:
                return false;
        }
        return true;
    }

    private void info() { info.chooseCommand(); }
    private void calculate() { calculate.chooseCommand(); }
    private void change() { change.chooseCommand(); }
}

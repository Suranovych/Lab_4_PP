package com.Learn;

import com.Learn.Logger.Logger;
import com.Learn.Planes.Airline;

import java.io.*;

public class Main {
    public static Logger logger = new Logger();
    public static void main(String[] args) {
            Airline base = new Airline();
            try {
                FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\JavaSmth.txt");
                try {
                    ObjectInputStream o = new ObjectInputStream(f);
                    base = (Airline) o.readObject();
                    o.close();
                } finally {
                    f.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                e.printStackTrace();
                logger.log(e.getMessage());
            } catch (IOException e) {
                System.out.println("Error initializing stream or the file is empty");
                logger.log(e.getMessage());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                logger.log(e.getMessage());
            } catch (Exception e) {
                logger.sendMessage("Cr1t1ca1 err0r: "+ e.getMessage());
            }

            Accumulator s = new Accumulator(base);
            do {
                System.out.println("\t\t\tMenu");
            } while (s.chooseCommandType());

            try {
                FileOutputStream f = new FileOutputStream("C:\\Users\\User\\Desktop\\JavaSmth.txt");
                try {
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(base);
                    o.close();
                } finally {
                    f.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
                logger.log(e.getMessage());
            } catch (IOException e) {
                System.out.println("Error initializing stream");
                e.printStackTrace();
                logger.log(e.getMessage());
            } catch (Exception e) {
                logger.sendMessage("Cr1t1ca1 err0r: "+ e.getMessage());
            }
        }
}

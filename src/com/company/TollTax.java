package com.company;

import java.io.File;
import java.util.Scanner;

public class TollTax {
    private int taxGiven;
    private int taxDue;

    void getTax(){
        try {
            File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\TollTax.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Vehicles v=new Vehicles();
                v.getVehicle();
                System.out.println();
                System.out.println("Name: "+data);
                System.out.println("Vehicle No.: "+data);
                System.out.println("Tax Given: "+data);
                System.out.println("Tax Due: "+data);
                Functioning f=new Functioning();
                f.get();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Data not Found.");
            Functioning f=new Functioning();
            f.get();
        }
    }
}

package com.company;

import java.io.File;
import java.util.Scanner;

public class CarMaintenance extends User {
   private String shop;
    private int cost;
    private String purchasedPart;

    CarMaintenance(){

    }

    void getdetails1(){
        try {
            File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\CarMaintenance.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println();
                System.out.println("Name: "+data);
                System.out.println("Vehicle No.: "+data);
                System.out.println("Last Service Day: "+data);
                System.out.println("Cost: "+data);
                System.out.println("Shop: "+data);
                System.out.println("Purchased Part: "+data);
                System.out.println("Address: "+data);
                Functioning f=new Functioning();
                f.get();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Car Out Of Maintenance");
            Functioning f=new Functioning();
            f.get();
        }
    }
}

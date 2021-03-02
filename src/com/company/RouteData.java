package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RouteData {
    private String from;
    private String to;

    public void getValue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Location");
        from=sc.nextLine();
        System.out.println("Enter your Destination");
        to=sc.nextLine();
        System.out.println();
        getRoute();
    }

    void getRoute(){
        try {
            File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\Route.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("Distance: "+data);
                System.out.println("Duration: "+data);
                System.out.println("Via: "+data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred.");
        }
        Functioning f=new Functioning();
        f.get();
    }
}

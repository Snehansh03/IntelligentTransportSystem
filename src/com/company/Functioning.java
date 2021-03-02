package com.company;

import java.util.*;

public class Functioning {

    void get(){
        System.out.println();
        System.out.println("1. Get Route");
        System.out.println("2. Pollution Card");
        System.out.println("3. Car Health Maintenance");
        System.out.println("4. Total Toll Tax");
        System.out.println("5. Driving License Details");
        System.out.println("6. Logout");
        System.out.println("Choose any one :");

        Scanner sc=new Scanner(System.in);
        int value;
        value=sc.nextInt();

        switch (value) {
            case 1:
                RouteData rd=new RouteData();
                rd.getValue();
                break;
            case 2:
                PollutionCard p=new PollutionCard();
                p.getdetails1();
                break;
            case 3:
                CarMaintenance c=new CarMaintenance();
                c.getdetails1();
                break;
            case 4:
                TollTax t=new TollTax();
                t.getTax();
                break;
            case 5:
                DrivingLicense d=new DrivingLicense();
                d.getDrivingLic();
                break;
            case 6:
                System.out.println();
                System.out.println("Successfully LogedOut");
                Main.getAdUs();
                break;
        }
    }
}

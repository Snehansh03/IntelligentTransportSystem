package com.company;

import java.io.File;
import java.util.Scanner;

public class DrivingLicense extends User {
    private String issuedBy;

    DrivingLicense(){

    }

    void getDrivingLic(){
        try {
            File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\DrivingLicense.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println();
                System.out.println("Name: "+data);
                System.out.println("Age: "+data);
                System.out.println("Address: "+data);
                System.out.println("Driving License No.: "+data);
                System.out.println("Vehicle No.: "+data);
                System.out.println("Valid Till: "+data);
                System.out.println("Issued By: "+data);
                System.out.println();
                renew();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Driving License Expired");
            Functioning f=new Functioning();
            f.get();
        }
    }

    void renew(){
        System.out.println("Do You Want To Renew The Driving License");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int value;
        Scanner sc=new Scanner(System.in);
        value=sc.nextInt();
        switch (value){
            case 1:
                System.out.println("Which Pack Do You want To Choose");
                System.out.println("1. Renew For 1 Year");
                System.out.println("2. Renew For 2 Years");
                System.out.println("3. Renew For 5 Years");
                int response;
                response=sc.nextInt();
                switch (response){
                    case 1:
                        validTill+=1;
                        System.out.println("Successfully Renewed");
                        Functioning f=new Functioning();
                        f.get();
                        break;
                    case 2:
                        validTill+=2;
                        System.out.println("Successfully Renewed");
                        Functioning f1=new Functioning();
                        f1.get();
                        break;
                    case 3:
                        validTill+=5;
                        System.out.println("Successfully Renewed");
                        Functioning f2=new Functioning();
                        f2.get();
                        break;
                }
            case 2:
                Functioning f=new Functioning();
                f.get();
                break;
        }
    }
}

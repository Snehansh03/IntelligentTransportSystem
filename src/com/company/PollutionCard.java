package com.company;

import java.io.File;
import java.util.*;

public class PollutionCard extends User{
    private String issuingPlace;

    PollutionCard(){

    }



    void getdetails1(){
        try {
            File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\PollutionCard.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println();
                System.out.println("Name: "+data);
                System.out.println("Vehicle No.: "+data);
                System.out.println("Issue Date: "+data);
                System.out.println("Expiry Date: "+data);
                System.out.println("Issuing Place: "+data);
                System.out.println();
                renew();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Pollution Card Expired");
            renew();
        }
    }

    void renew(){
        System.out.println("Do You Want To Renew The Pollution Card");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int value;
        Scanner sc=new Scanner(System.in);
        value=sc.nextInt();
        System.out.println();
        switch (value){
            case 1:
                System.out.println("Which Pack Do You want To Choose");
                System.out.println("1. Renew For 3 Months");
                System.out.println("2. Renew For 6 Months");
                System.out.println("3. Renew For 12 Months");
                int response;
                response=sc.nextInt();
                switch (response){
                    case 1:
                        pissueDate+=3;
                        System.out.println("Successfully Renewed");
                        Functioning f=new Functioning();
                        f.get();
                        break;
                    case 2:
                        pissueDate+=6;
                        System.out.println("Successfully Renewed");
                        Functioning f1=new Functioning();
                        f1.get();
                        break;
                    case 3:
                        pissueDate+=12;
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

package com.company;

import java.util.Scanner;

public class User {
    String uname;
    int age;
    String pass;
    String createpass;
    String pissueDate;
    String pexpiryDate;
    String vehicleNo;
    String lastServiceDay;
    String drivLicNo;
    String validTill;
    String dob;
    String address;


    User(){

    }


    User(String uname,String pass){
        this.uname=uname;
        this.pass=pass;
    }


    void logreg(){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("Choose 1 or 2 :");
        int value ;
        value=sc.nextInt();
        switch (value){
            case 1:
                getValue();
                break;
            case 2:
                getrValue();
                break;
        }
    }

    void getValue(){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Name");
        uname =sc.nextLine();
        System.out.println("Enter pass");
        pass =sc.nextLine();
        LoginData l=new LoginData("","");
        l.validate();
        Functioning f=new Functioning();
        f.get();
    }

    void getrValue(){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Name");
        uname =sc.nextLine();
        System.out.println("Enter age");
        age =sc.nextInt();
        sc.nextLine();
        System.out.println("Create Password");
        createpass=sc.nextLine();
        System.out.println();
        getdetails();
        RegisterData r=new RegisterData("","");
        r.saveDetails();

    }

    void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date Of Birth");
        dob=sc.nextLine();
        System.out.println("Enter Your Address");
        address=sc.nextLine();
        System.out.println("Enter Driving license Number");
        drivLicNo=sc.nextLine();
        System.out.println("Enter Vehicle Number");
        vehicleNo=sc.nextLine();
        System.out.println("Enter Driving License Validity");
        validTill=sc.nextLine();
        System.out.println("Enter Pollution Card Issuing Date");
        pissueDate=sc.nextLine();
        System.out.println("Enter Pollution Card Expiry Date");
        pexpiryDate=sc.nextLine();
        System.out.println("Enter Last Servicing Day");
        lastServiceDay=sc.nextLine();

    }
}

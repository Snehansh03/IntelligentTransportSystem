package com.company;

import java.util.Scanner;

public class Vehicles extends User{
    String vtype;
    String brand;
    String style;

    Vehicles(){

    }

    void getVehicle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Type Of Vehicle");
        vtype=sc.nextLine();
        System.out.println("Enter The Brand Of Vehicle");
        brand=sc.nextLine();
        System.out.println("Enter The Style Of Vehicle");
        style=sc.nextLine();
    }
}

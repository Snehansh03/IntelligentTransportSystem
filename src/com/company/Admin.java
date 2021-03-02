package com.company;

import java.util.Scanner;

public class Admin {
    protected String aname;
    protected String apass;

    Admin(){

    }

    Admin(String aname,String apass){
        this.aname=aname;
        this.apass=apass;
    }

    void getaValue(){
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Name");
        aname =sc.nextLine();
        System.out.println("Enter Password");
        apass =sc.nextLine();
        AdminData ad=new AdminData("","");
        ad.validate();
    }
}

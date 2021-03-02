package com.company;

import java.io.File;
import java.util.Scanner;

public class AdminData extends Admin {

    AdminData(String aname,String apass){
        super(aname,apass);
    }

    void validate(){
        try {
            File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\Admin.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(aname==data && apass==data){
                    System.out.println("Successfully LogedIn");
                }
                else {
                    System.out.println("Name or Password Incorrect");
                }
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Name or Password Incorrect");
        }
    }
}

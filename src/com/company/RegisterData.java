package com.company;

import java.io.FileWriter;


public class RegisterData extends User {
    RegisterData(String uname,String createpass){

        super(uname,createpass);
    }

    void saveDetails(){
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\Login.txt");
            myWriter.write(dob);
            myWriter.write(address);
            myWriter.write(drivLicNo);
            myWriter.write(vehicleNo);
            myWriter.write(validTill);
            myWriter.write(pissueDate);
            myWriter.write(pexpiryDate);
            myWriter.write(lastServiceDay);
            myWriter.close();
            System.out.println("Successfully Registered");
        } catch (Exception e) {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
}

package com.company;

import com.company.User;
import java.io.File;
import java.util.*;

public class LoginData extends User {
    LoginData(String uname,String pass){
        super(uname,pass);
    }

    void validate(){
            try {
                File myObj = new File("C:\\Users\\SATYAM\\Desktop\\IntelligentTransportSystem\\Login.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if(uname==data && pass==data){
                        System.out.println("Successfully LogedIn");
                    }
                    else {
                        System.out.println("Name or Password Incorrect");
                        User u=new User();
                        u.logreg();
                    }
                }
                myReader.close();
            } catch (Exception e) {
                System.out.println("Name or Password Incorrect");
            }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("----------------**********----------------");
        System.out.println();
        System.out.println("-----  Intelligent Transport System  -----");
        System.out.println();
        System.out.println("----------------**********----------------");
        System.out.println();
        getAdUs();
    }

    static void getAdUs(){
        Scanner sc= new Scanner(System.in);
        int adus;
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("Choose 1 or 2 :");
        adus=sc.nextInt();
        switch (adus){
            case 1:
                User u=new User();
                u.logreg();
                break;
            case 2:
                Admin a=new Admin();
                a.getaValue();
                break;
        }
    }
}

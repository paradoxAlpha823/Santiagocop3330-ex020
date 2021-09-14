/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String s1 = x.nextLine();
        Double num1 = null;
        Double tac = null;
        Double tax2 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        System.out.print("What State do you live in? ");
        String s2 = x.nextLine();
        String s2u = s2.toUpperCase(Locale.ROOT);



        if(s2u.equals("WISCONSIN")){
            tac=0.05;
            System.out.print("What County do you live in? ");
            String s3 = x.nextLine();
            String s3u = s3.toUpperCase(Locale.ROOT);

            if(s3u.equals("EAU CLAIRE")){
                tax2=0.005;
            }else if(s3u.equals("DUNN")){
                tax2=0.004;
            }else{
                tax2=0.0;
            }
        }else if(s2u.equals("ILLINOIS")){
            tac=0.08;
            tax2=0.0;
        }else
        {
            tac=0.0;
            tax2=0.0;
        }
        double tax = tac+tax2;
        double t1 = tax*num1;
        double t2 = Math.ceil(t1*1000);
        double t3 = t2/1000;
        double a1 = t1+num1;
        double a2 = Math.ceil(a1*100);
        double a3 = a2/100;
        String a3s = String.format("%.02f",a3);
        String t3s = String.format("%.02f",t3);

        System.out.println("The tax is $"+t3s+".\r\n"+"The total is $"+a3s+".");

        System.exit(0);
    }
}

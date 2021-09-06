package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float c_to, c_from, rate;

        System.out.print("How many euros are you exchanging? ");
        c_from = input.nextFloat();
        System.out.print("What is the exchange rate? ");
        rate = input.nextFloat();
        System.out.printf("%.0f euros at an exchange rate of %.4f is\n", c_from, rate);

        c_to = rate * c_from;
        System.out.printf("%.2f U.S. dollars", c_to);


    }
}

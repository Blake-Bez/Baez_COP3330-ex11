/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("How many euros are you exchanging? ");
            double c_from = scan.nextDouble();
            System.out.print("What is the exchange rate? ");
            double rate = scan.nextDouble();

            double c_to = c_from * rate;

            double roundOff = Math.round(c_to * 100.0) / 100.0;

            System.out.println(c_from + " euros at an exchange rate of " + rate + " is " + "\n" + roundOff + " U.S. dollars.");

        }
    }
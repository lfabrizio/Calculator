package com.fabrizio;

import java.util.Scanner;

// follow up to the School Management system project
public class Main {
    public static void maina(String[] args) {
    Scanner in = new Scanner(System.in);
    int option;
    int number1, number2;

        while (true) {
            System.out.println("Enter 1: addition 2. Subtraction 3. division 4. multiplication ");
            option = Integer.parseInt(in.next());
            if(option == 1){
                askForNumber();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                System.out.println("The Sum is " + number1 + number2);
            }
        }
    }
    public static void askForNumber(){
        System.out.println("Enter two numbers:");
        }
}

package com.fabrizio;

import java.util.Scanner;

// follow up to the School Management system project
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        int number1, number2;

        while (true) {
            System.out.println("Enter 1: addition 2. Subtraction 3. division 4. multiplication ");
            option = Integer.parseInt(in.next());
            if (option == 1) {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float sum = number1 = number2;
                System.out.println("The Sum is " + sum);
            } else if (option == 2) {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float diff = number1 - number2;
                System.out.println("The difference is " + diff);
            } else if (option == 3) {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float quotient = number1 / number2;
                System.out.println("The division is " + quotient);
            } else {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float multiply = number1 * number2;
                System.out.println("The multiplication is " + multiply);
            }
        }
    }
    public static void askForNumbers(){
        System.out.println("Enter two numbers:");
        }
}

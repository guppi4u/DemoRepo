package com.kunal;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = scan.nextInt();
        scan.close();
        Leapyear.leapYearCheck(year);
    }

    static void leapYearCheck(int userInput) {
        if (userInput % 4 == 0) {
            System.out.println("Its leap year");
        } else {
            System.out.println("Its not a leap year");
        }

    }
}

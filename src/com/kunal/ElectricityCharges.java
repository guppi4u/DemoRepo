package com.kunal;

import java.util.Scanner;

public class ElectricityCharges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter consumed units for month :");
        int currentUnit = scan.nextInt();
        ElectricityCharges.calculateCurrentUnit(currentUnit);
    }

    static void calculateCurrentUnit(int unit) {
        double unitCharges = 4.75;
        double billCharges = (unit * unitCharges);
        System.out.println("Current charges of the month : " + billCharges + " rupees ");
    }
}
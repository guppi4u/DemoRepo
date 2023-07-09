package com.kunal;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height of volume");
        int height = scan.nextInt();
        System.out.println("Enter breath of volume");
        int breath = scan.nextInt();
        VolumeOfPrism.calculateArea(breath,height);
    }
    static void calculateArea(int breath, int height){
        double volumeOfPrism=(breath*height);
        System.out.println("Volume of Prism is : "+volumeOfPrism);
    }
}

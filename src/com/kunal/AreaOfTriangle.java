package com.kunal;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height of triangle");
        int height = scan.nextInt();
        System.out.println("Enter base of triangle");
        int base = scan.nextInt();
        AreaOfTriangle.calculateArea(height,base);

    }
    static void calculateArea(int base, int height){
        double areaOfTrianagle=(base*height)*(0.5);
        System.out.println("Area of Triangle is : "+areaOfTrianagle);
    }
}

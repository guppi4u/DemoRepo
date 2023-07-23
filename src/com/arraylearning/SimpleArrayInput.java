package com.arraylearning;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArrayInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Declaring scanner class


        String[] names= new String[5];
        System.out.println( "Enter array elements");
        for (int i = 0; i < names.length; i++) {
            names[i]=scan.next();

        }
        System.out.println(Arrays.toString(names));
    }
}

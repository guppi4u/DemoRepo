package com.arraylearning;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter Array list items");
        ArrayList<ArrayList<Integer>> mulList= new ArrayList<>(); // creating multidimensional  arraylist with initial capacity empty

        // initialisation or adding lists
        for (int i = 0; i <3 ; i++) {
            mulList.add(new ArrayList<>()); //adding 3 array list
        }
        // adding elements to array list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                mulList.get(i).add(in.nextInt());
            }
        }
        System.out.println(mulList);
    }
}

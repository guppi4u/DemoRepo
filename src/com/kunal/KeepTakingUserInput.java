package com.kunal;

import java.util.Scanner;

public class KeepTakingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Enter the number ");
            String userInput= scan.next().toUpperCase();
            if(userInput.equals("X")) break;
            int number=Integer.parseInt(userInput);
            sum+=number;
        }
        System.out.println("Sum of user input : "+sum);
    }
}

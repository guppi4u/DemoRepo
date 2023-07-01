package com.kunal;

import java.util.Scanner;

public class Integersum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 =scan.nextInt();
        System.out.println("Enter 2nd  number: ");
        int num2 =scan.nextInt();
        scan.close();
        Integersum.calculateSum(num1,num2);
        Integersum.calculateDivision(num1,num2);
        Integersum.calculateDifference(num1,num2);
        Integersum.calculateMultiplication(num1,num2);
    }
    static void calculateSum(int n1,int n2){
        int sum=0;
        sum=n1+n2;
        System.out.println("Sum of two numbers : "+sum);
    }
    static void calculateDifference(int n1,int n2){
        int diff=0;
        diff=n1-n2;
        System.out.println("Subtraction of two numbers : "+diff);
    }
    static void calculateDivision(int n1,int n2){
        int div=0;
        div=n1/n2;
        System.out.println("Division of two numbers : "+div);
    }
    static void calculateMultiplication(int n1,int n2){
        int mul=0;
        mul=n1*n2;
        System.out.println("Division of two numbers : "+mul);
    }
}

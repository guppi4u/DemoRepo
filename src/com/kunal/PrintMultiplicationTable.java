package com.kunal;

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for you want tables to be printed : ");
        int num1 =scan.nextInt();
        scan.close();
        PrintMultiplicationTable.printMulTable(num1);
    }
    static void printMulTable(int n1){
        for(int i=1;i<=10;i++){
            int mul=n1*i;
            System.out.println(n1 +" * "+ i +" = "+mul);
        }

    }
}

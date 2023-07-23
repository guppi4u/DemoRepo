package com.arraylearning;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr ={1,2,5,6,7,9}; //creating an array
        swap(arr,1,3); //calling swap function
        System.out.println(Arrays.toString(arr)); // printing array
    }
    static void swap(int[] arr, int index1 ,int index2){
        int temp =arr[index1]; // assigning tmp to arr[index1]
        arr[index1]=arr[index2];
        arr[index2]=temp; // assgining arr[index2] to temp
    }
}

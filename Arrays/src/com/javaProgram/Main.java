package com.javaProgram;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myArr = getArr(5);
	    for(int i=0; i<myArr.length; i++){
            System.out.println("Element " + i + ", types value was" + myArr[i]);
        }

        System.out.println(getAverage(myArr));
    }

    public static int[] getArr(int num) {
        System.out.println("Enter " + num + " numbers. \r");
        int[] arr = new int[num];
        for(int i = 0; i <arr.length; i++ ){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }
}

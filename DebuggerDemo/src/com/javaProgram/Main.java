package com.javaProgram;

public class Main {

    public static void main(String[] args) {
        StrinUtilites utils = new StringUtilities;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10){
            utils.addChar(sb,"a");
        }
        System.out.println(sb);
    }
}

import java.util.Scanner;
public class SortedArray {


    public static int[] getIntegers(int arrLength) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] input) {
        boolean isSwap = true;

        while(isSwap) {
            isSwap = false;

            for(int i = 0; i < input.length - 1; i++) {
                if(input[i] < input[i + 1]) {
                    int temp;
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;

                    isSwap = true;
                }
            }
        }
        return input;
    }
}

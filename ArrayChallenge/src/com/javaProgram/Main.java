package com.javaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArr = getArr(5);
        sort(myArr);
    }

    public static void sort(int[] arr){
        int[] sortedArr = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i< arr.length-1;i++){
                if(sortedArr[i] < sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }

        }
        for(int i=0;i<sortedArr.length;i++){
            System.out.println(sortedArr[i]);
        }

    }

    public static int[] getArr(int num){
        int[] arr = new int[num];
        for (int i=0;i<arr.length;i++){
            System.out.println("enter numbers until it stop asking");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


}

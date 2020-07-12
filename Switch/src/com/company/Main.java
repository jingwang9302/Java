package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(2);
    }

    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("other days");

        }
    }
}

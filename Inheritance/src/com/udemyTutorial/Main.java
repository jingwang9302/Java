package com.udemyTutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Outlander outlander = new Outlander("Outlander", "4WD", 5, 5, 6, false, 36);
        outlander.accelerate(30);
        outlander.steer(30);
        System.out.println("-------------------------------------------");
        outlander.accelerate(20);
    }
}

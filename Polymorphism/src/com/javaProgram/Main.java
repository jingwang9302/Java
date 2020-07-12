package com.javaProgram;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private  String name;
    private int speed;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.speed = 0;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void startEngine(){
        this.speed = 0;
        System.out.println("Engine start, speed = " + this.speed);
    }

    public void accelerate(int addedSpeed){
        this.speed += addedSpeed;
        System.out.println("Accelerating... Current speed = " + this.speed);
    }

    public void brake(int decreaseSpeed){
        this.speed -= decreaseSpeed;
        System.out.println("Pressing Brake, current speed = " + this.speed);
    }
}

class Mini extends Car{
    private int speed;

    public Mini(int cylinders, String name) {
        super(cylinders, name);
        this.speed = 2;

    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void startEngine() {
        System.out.println("Mini engine start speed = " + getSpeed());
        System.out.println(getClass().getSimpleName()); // return Mini
    }

    @Override
    public void accelerate(int addedSpeed) {
        this.speed += addedSpeed;
        System.out.println("Mini add speed");
    }

    @Override
    public void brake(int decreaseSpeed) {
        this.speed -= decreaseSpeed;
        System.out.println("Mini pressing Brake, current speed = " + this.speed);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8,"base car");
        car.startEngine();
        car.accelerate(5);
        car.brake(3);
        System.out.println("--------------------------------------------");
        Mini mini = new Mini(4,"myMini");
        mini.startEngine();
        mini.accelerate(8);
        mini.brake(2);
    }
}

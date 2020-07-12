package com.javaProgram;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240",dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 20, new Resolution(2540,1080));
        MotherBoard theMotherBoard = new MotherBoard("BH","Asus", 4,6,"v2");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        thePC.powerUp();

        Wall wall1 = new Wall("N");
        Wall wall2 = new Wall("S");
        Wall wall3 = new Wall("W");
        Wall wall4 = new Wall("E");

        Ceiling ceiling = new Ceiling(3,"white");

        Bedroom bedroom = new Bedroom("T's bedroom",wall1,wall2,wall3,wall4,ceiling,new Bed("king",2,1,1,2),new Lamp("modern",true,70));
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}

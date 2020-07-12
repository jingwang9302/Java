package com.javaProgram;

public class Printer {
    private int tonerLevel;
    private int numberOfPagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagePrinted = 0;
        this.duplexPrinter = duplex;
    }

    public int addToner(int toner){
        if(this.tonerLevel + toner > 100){
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += 100;
        }
    }

    public void printPages(int pages){
        int pageToPrint = pages;
        if(this.duplexPrinter == true){
            pageToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagePrinted += pageToPrint;
    }

    public int getNumberOfPagePrinted() {
        return numberOfPagePrinted;
    }
}

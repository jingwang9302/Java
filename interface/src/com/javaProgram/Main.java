package com.javaProgram;

public class Main {

    public static void main(String[] args) {
        ITelephone traceysPhone;
        traceysPhone = new Deskphone(123);
        traceysPhone.powerOn();
        traceysPhone.answer();
    }
}

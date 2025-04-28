package main.java.level_1.exercici_5;

import main.java.level_1.exercici_5.model.interfaces.PiValue;

public class Main {

    public static void main(String[] args) {
        PiValue piValue = () -> 3.1415;

        System.out.println(piValue.getPiValue());
    }

}
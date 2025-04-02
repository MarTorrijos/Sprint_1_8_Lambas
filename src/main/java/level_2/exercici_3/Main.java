package main.java.level_2.exercici_3;

import main.java.level_2.exercici_3.model.interfaces.OperationInterface;

public class Main {

    public static void main(String[] args) {
        float num1 = 10.0f;
        float num2 = 2.0f;

        OperationInterface addition = () -> num1 + num2;
        System.out.println("Suma: " + addition.operation());

        OperationInterface subtraction = () -> num1 - num2;
        System.out.println("Resta: " + subtraction.operation());

        OperationInterface multiplication = () -> num1 * num2;
        System.out.println("Multiplicación: " + multiplication.operation());

        OperationInterface division = () -> num1 / num2;
        System.out.println("División: " + division.operation());
    }

}
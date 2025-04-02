package main.java.level_2.exercici_2;

import main.java.level_2.exercici_2.model.IntegerToString;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(3, 55, 44);
        System.out.println(new IntegerToString().stringWithCommas(numberList));

    }

}
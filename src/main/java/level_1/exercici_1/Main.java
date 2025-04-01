package main.java.level_1.exercici_1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("aguacate", "berberecho", "calcetín", "perro");

        stringList.stream()
                .filter(word -> word.contains("o"))
                .forEach(System.out::println);
    }

}
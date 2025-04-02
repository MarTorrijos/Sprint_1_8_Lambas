package main.java.level_2.exercici_2.model;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerToString {

    public String stringWithCommas(List<Integer> numberList) {
        return numberList.stream()
                .map(integer -> (integer % 2 == 0) ? "e" + integer : "o" + integer)
                .collect(Collectors.joining(", "));
    }

}
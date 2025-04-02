package main.java.level_2.exercici_4;

import main.java.level_2.exercici_4.model.StringChanger;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> list = Arrays.asList("Carbonara", 1000, "The spice must flow", 0.89, "Ensaimadas con pasas");
        String line = "----------------------------------";

        System.out.println("Lista original:\n" + list  + "\n" + line);

        System.out.println("Strings por orden alfabético:\n"
                + new StringChanger().getAlphabeticalStrings(list) + "\n" + line);
        System.out.println("Primero las Strings que empiezan por e, luego el resto:\n"
                + new StringChanger().eStringsFirst(list) + "\n" + line);
        System.out.println("Strings en las que se cambian la letra a por un 4:\n"
                + new StringChanger().changeATo4(list) + "\n" + line);
        System.out.println("Solo mostramos los números:\n"
                + new StringChanger().showNumbersOnly(list));

    }

}
package main.java.level_2.exercici_1;

import main.java.level_2.exercici_1.model.NameSelector;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ermenegildo", "Virtudes", "Anacleto", "Ana", "Fra");
        System.out.println(new NameSelector().selectedNames(names));

    }

}
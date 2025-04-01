package main.java.level_1.exercici_6;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> list = List.of(2, 34, "Pepino", "ESmeralda", 29, "Sol");

        System.out.println("Lista original: " + list);

        List<String> sortedStrings = list.stream()
                .filter(word -> word instanceof String)
                .map(Object::toString)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();

        System.out.println("Palabras ordenadas por longitud: " + sortedStrings);

    }

}
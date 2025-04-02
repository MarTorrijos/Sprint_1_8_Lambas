package main.java.level_2.exercici_1.model;

import java.util.List;
import java.util.stream.Collectors;

public class NameSelector {

    public List<String> selectedNames(List<String> names) {
        return names.stream()
                .filter(word -> word.charAt(0) == 'A' && word.length() == 3)
                .collect(Collectors.toList());
    }

}
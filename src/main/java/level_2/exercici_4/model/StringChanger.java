package main.java.level_2.exercici_4.model;

import java.util.List;
import java.util.stream.Collectors;

public class StringChanger {

    public List<String> getAlphabeticalStrings(List<Object> list) {
        return list.stream()
                .filter(word -> word instanceof String)
                .map(Object::toString)
                .sorted()
                .toList();
    }

    public List<String> eStringsFirst(List<Object> list) {
        return list.stream()
                .filter(word -> word instanceof String)
                .map(Object::toString)

                .sorted((s1, s2) -> {
                    boolean containsE1 = s1.toLowerCase().charAt(0) == 'e';
                    boolean containsE2 = s2.toLowerCase().charAt(0) == 'e';

                    if (containsE1 && !containsE2) {
                        return -1;
                    } else if (!containsE1 && containsE2) {
                        return 1;
                    } else {
                        return 0;
                    }
                })

                .collect(Collectors.toList());
    }

    public List<String> changeATo4(List<Object> list) {
        return list.stream()
                .filter(word -> word instanceof String)
                .map(Object::toString)
                .map(word -> word.replace('a', '4'))
                .toList();
    }

    public List<String> showNumbersOnly(List<Object> list) {
        return list.stream()
                .filter(number -> number instanceof Integer || number instanceof Double)
                .map(Object::toString)
                .toList();
    }

}
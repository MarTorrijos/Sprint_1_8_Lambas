import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("aguacate", "berberecho", "calcetín");

        stringList.stream()
                .filter(word -> word.contains("o"))
                .forEach(System.out::println);
    }

}
package main.java.level_1.exercici_8;

import main.java.level_1.exercici_8.model.interfaces.ReverseInterface;

public class Main {

    public static void main(String[] args) {

        ReverseInterface originalString = string -> new StringBuilder(string).reverse().toString();
        System.out.println(originalString.reverse("Stringgg"));

    }

}
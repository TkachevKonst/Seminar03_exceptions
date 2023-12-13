package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class NameException extends RuntimeException {
    public NameException() {
        super("Не корректно введено Фамилия Имя Отчество");
    }

    public static void NameCheck(String s) {
        String string = s.toLowerCase();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                ".", "/", "|", ",", "?", "@", "!", "#", "&", "*", "+", "-", "'", ";", ":",
                "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h",
                "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"));
        String[] strings = string.split(" ");
        if (strings.length != 3){
            throw new NameException();
        }
        for (String string1: strings) {
            String[] strings1 = string1.split("");
            for (String s1:strings1) {
                if (list.contains(s1)) {
                    throw new NameException();
                }
            }
        }

    }
}

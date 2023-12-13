package org.example;

public class SexException extends RuntimeException {
    public SexException() {
        super("Не корректно задан пол.");
    }

    public static void SexCheck(String s) {
        String string = s.toLowerCase();
        if(!string.equals("м") && !string.equals("ж"))
            throw new SexException();
    }
}

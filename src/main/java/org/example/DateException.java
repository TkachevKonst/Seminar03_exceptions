package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class DateException extends RuntimeException {
    public DateException() {
        super("Некорректная дата");
    }

    public static void DateCheck(String s) {
        String[] strings = s.split("\\.");
        if (strings.length != 3)
            throw new DateException();
        if(strings[0].length() != 2 || strings[1].length() != 2 || strings[2].length() != 4)
            throw new DateException();
        for (String string: strings) {
            try {
                int a = Integer.parseInt(string);
            }catch (NumberFormatException e){
                throw new DateException();
            }
        }
        int d = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int y = Integer.parseInt(strings[2]);
        if(m < 1 || m > 12)
            throw new DateException();
        if(1940 > y || y > 2019)
            throw new DateException();
        if(1 > d || d > 31)
            throw new DateException();

    }
}

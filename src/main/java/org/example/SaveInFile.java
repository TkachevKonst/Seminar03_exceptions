package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class SaveInFile {
    public static void Save(Man man) {
        NullException.NullCheck(man);
        String[] strings = man.getName().split(" ");
        if (strings[0].charAt(strings[0].length() - 1) == 'а') {
            strings[0] = strings[0].substring(0, strings[0].length() - 1);
        }
        String fileName = String.format(strings[0] + ".txt");
        String text = man.toString();


        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

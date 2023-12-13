package org.example;

import java.text.ParseException;
import java.util.Scanner;


public class InputConsole {
    private Scanner scanner = new Scanner(System.in);

    public void inputFromConsole(Man man) throws NameException, TelephoneException, DateException, SexException {
        System.out.println("Введите ФИО (полностью), номер телефона (11 цифр), " +
                "дату рождения (формат дд.мм.гггг)  и пол (где ж - жен., м - муж.). В произвольном порядке, главное через пробел" +
                "\n Например:\n ФИО: Петров Петр Петрович,\n тел: 9089855486, \n дата рождения: 02.05.2005 " +
                "\n пол: m.");
        InputName(man);
        InputTelephone(man);
        InputBirth(man);
        InputSex(man);
        System.out.println("Проверте правильноть данных");
        System.out.println(man);
        System.out.println("Если хотите что-то поменять введите '+' \n если нет то введите '-'");
        String string1 = prompt();
        if (string1.equals("+")) {
            boolean b = true;
            while (b == true) {
                System.out.println("Поменять ФИО введите - 1 \n Номер телефона - 2 \n " +
                        "Дату рождения -3 \n Пол -4\n Если все корректно введите - любой символ");
                switch (prompt()) {
                    case "1":
                        InputName(man);
                        break;
                    case "2":
                        InputTelephone(man);
                        break;
                    case "3":
                        InputBirth(man);
                        break;
                    case "4":
                        InputSex(man);
                        break;
                    default:
                        b = false;
                        break;
                }
            }

        }
    }

    private void InputName(Man man) {
        String s = prompt("ФИО: ");
        NameException.NameCheck(s);
        man.setName(s);
    }

    private void InputTelephone(Man man) {
        String s = "";
        try {
            s = prompt("Номер телефона: ");
            long a = Long.parseLong(s);
        } catch (NumberFormatException e) {
            throw new TelephoneException(s);
        }
        TelephoneException.TelefonCheck(s);
        man.setTelephone(s);
    }

    private void InputBirth(Man man) {
        String s = prompt("Дата рождения: ");
        DateException.DateCheck(s);
        man.setBirth(s);
    }

    private void InputSex(Man man) {
        String s = prompt("Пол: ");
        SexException.SexCheck(s);
        man.setSex(s);
    }

    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private String prompt() {
        return scanner.nextLine();
    }
}

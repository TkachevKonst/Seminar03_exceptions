package org.example;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b == true) {
            InputConsole console = new InputConsole();
            Man man = new Man();
            try {
                console.inputFromConsole(man);
            } catch (NameException | TelephoneException | DateException | SexException e) {
                System.out.println(e.getMessage());
            }
            SaveInFile.Save(man);
            System.out.println("Если необходимо ввести данные другого человека нажмите - '+', \n " +
                    "если нет то любую другою клавишу");
            String string = scanner.nextLine();
            if (!string.equals("+"))
                b = false;
        }
    }

}


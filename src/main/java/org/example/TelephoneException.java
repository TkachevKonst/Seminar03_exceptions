package org.example;

public class TelephoneException extends NumberFormatException {
    public TelephoneException(String s) {
        super("Не корректно введен номер телефона, проверте правильность написания номера " + s);
    }

    public TelephoneException() {
        super("Не корректно введен номер телефона. Проверте количество цифр");
    }

    public static void TelefonCheck(String s) {
        if (s.length() != 11) {
            throw new TelephoneException();
        }
    }
}

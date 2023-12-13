package org.example;

public class NullException extends RuntimeException {
    public NullException(){
        super("Не достаточно информации");
    }
    public static void NullCheck (Man man){
        if(man.getName().isEmpty() || man.getTelephone().isEmpty()
                || man.getBirth().isEmpty() || man.getSex().isEmpty()){
            throw new NullException();
        }
    }
}

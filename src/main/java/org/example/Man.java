package org.example;

import java.util.Date;

public class Man {
    String name = "";
    String telephone = "";
    String birth = "";
    String sex = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Man() {}
    public Man(String name,String telephone, String birth, String sex){
        this.name = name;
        this.telephone = telephone;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("<"+name+">"+" "+"<"+telephone+">"+" "+"<"+birth+">"+" "+"<"+sex+">");
    }
}

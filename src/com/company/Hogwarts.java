package com.company;
public class Hogwarts {

    private String name;
    private String surname;
    private int witchcraft;
    private int transgressionKm;

    public Hogwarts(String name, String surname, int witchcraft, int transgressionKm) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.transgressionKm = transgressionKm;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgressionKm() {
        return transgressionKm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgressionKm(int transgressionKm) {
        this.transgressionKm = transgressionKm;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Фамилия: " + surname +
                ", Колдовство: " + witchcraft +
                ", Трансгрессия: " + transgressionKm +
                " км";
    }
}
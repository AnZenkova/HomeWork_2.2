package com.company;
public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, String surname, int witchcraft, int transgressionKm, int hardWork, int loyalty, int honesty) {
        super(name, surname, witchcraft, transgressionKm);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Колдовство: " + getWitchcraft() +
                ", Трансгрессия: " + getTransgressionKm() +
                " км, " +
                "Факультет: Пуфендуй" +
                ", Трудолюбие: " + hardWork +
                ", Верность: " + loyalty +
                ", Честность: " + honesty;
    }
}
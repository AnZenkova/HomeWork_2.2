package com.company;
public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int witchcraft, int transgressionKm, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, witchcraft, transgressionKm);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Колдовство: " + getWitchcraft() +
                ", Трансгрессия: " + getTransgressionKm() +
                " км, " +
                "Факультет: Слизерин" +
                ", Хитрость: " + cunning +
                ", Решительность: " + determination +
                ", Амбициозность: " + ambition +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + lustForPower;
    }
}
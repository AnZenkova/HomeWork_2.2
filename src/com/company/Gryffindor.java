package com.company;
public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;


    public Gryffindor(String name, String surname, int witchcraft, int transgressionKm, int nobility, int honor, int courage) {
        super(name, surname, witchcraft, transgressionKm);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Колдовство: " + getWitchcraft() +
                ", Трансгрессия: " + getTransgressionKm() +
                " км, " +
                "Факультет: Гриффиндор, " +
                "Благородство: " + nobility +
                ", Честь: " + honor +
                ", Храбрость: " + courage;
    }
}
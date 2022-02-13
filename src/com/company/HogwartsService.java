package com.company;
public class HogwartsService {

    public static void printStudent(Hogwarts[] hogwarts, String name, String surname) {
        System.out.println("Характеристика студента: " + name + " " + surname);
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName() == name && hogwarts[i].getSurname() == surname) {
                System.out.println(hogwarts[i]);
            }
        }
    }

    public static void comparisonStudentsOfSameFaculty(Gryffindor[] gryffindor, String name1, String surname1, String name2, String surname2) {
        Gryffindor a = null;
        Gryffindor b = null;
        for (int i = 0; i < gryffindor.length; i++) {
            if (gryffindor[i].getName() == name1 && gryffindor[i].getSurname() == surname1) {
                a = gryffindor[i];
            }
        }
        for (int i = 0; i < gryffindor.length; i++) {
            if (gryffindor[i].getName() == name2 && gryffindor[i].getSurname() == surname2) {
                b = gryffindor[i];
            }
        }
        if (a.getCourage() < b.getCourage()) {
            System.out.println(a.getName() + " " + a.getSurname() + " благороднее, чем " + b.getName() + " " + b.getSurname());
        } else if (b.getCourage() < a.getCourage()) {
            System.out.println(b.getName() + " " + b.getSurname() + " благороднее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В блогородности они одинаковы");
        }
        if (a.getCourage() < b.getCourage()) {
            System.out.println("У " + a.getName() + " " + a.getSurname() + " больше чести, чем у  " + b.getName() + " " + b.getSurname());
        } else if (b.getCourage() < a.getCourage()) {
            System.out.println("У " + b.getName() + " " + b.getSurname() + " больше чести, чем у " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В чести они одинаковы");
        }
        if (a.getCourage() < b.getCourage()) {
            System.out.println(a.getName() + " " + a.getSurname() + " храбрее, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getCourage() < a.getCourage()) {
            System.out.println(b.getName() + " " + b.getSurname() + " храбрее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В храбрости они одинаковы");
        }
    }

    public static void comparisonStudentsOfSameFaculty(Slytherin[] slytherin, String name1, String surname1, String name2, String surname2) {
        Slytherin a = null;
        Slytherin b = null;
        for (int i = 0; i < slytherin.length; i++) {
            if (slytherin[i].getName() == name1 && slytherin[i].getSurname() == surname1) {
                a = slytherin[i];
            }
        }
        for (int i = 0; i < slytherin.length; i++) {
            if (slytherin[i].getName() == name2 && slytherin[i].getSurname() == surname2) {
                b = slytherin[i];
            }
        }
        if (a.getCunning() < b.getCunning())  {
            System.out.println(a.getName() + " " + a.getSurname() + " хитрее, чем " + b.getName() + " " + b.getSurname());
        } else if (b.getCunning() < a.getCunning()) {
            System.out.println(b.getName() + " " + b.getSurname() + " хитрее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В хитрости они одинаковы");
        }
        if (a.getDetermination() < b.getDetermination()) {
            System.out.println("У " + a.getName() + " " + a.getSurname() + " больше решительности, чем у  " + b.getName() + " " + b.getSurname());
        } else if (b.getDetermination() < a.getDetermination()) {
            System.out.println("У " + b.getName() + " " + b.getSurname() + " больше решительности, чем у " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В решительности они одинаковы");
        }
        if (a.getAmbition() < b.getAmbition()) {
            System.out.println(a.getName() + " " + a.getSurname() + " амбициознее, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getAmbition() < a.getAmbition()) {
            System.out.println(b.getName() + " " + b.getSurname() + " амбициознее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В амбициозности они одинаковы");
        }
        if (a.getResourcefulness() < b.getResourcefulness()) {
            System.out.println(a.getName() + " " + a.getSurname() + " находчивее, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getResourcefulness() < a.getResourcefulness()) {
            System.out.println(b.getName() + " " + b.getSurname() + " находчивее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В находчивости они одинаковы");
        }
        if (a.getLustForPower() < b.getLustForPower()) {
            System.out.println(a.getName() + " " + a.getSurname() + " жажда власти больше, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getLustForPower() < a.getLustForPower()) {
            System.out.println(b.getName() + " " + b.getSurname() + " жажда власти больше, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В жажде власти они одинаковы");
        }
    }

    public static void comparisonStudentsOfSameFaculty(Hufflepuff[] hufflepuffs, String name1, String surname1, String name2, String surname2) {
        Hufflepuff a = null;
        Hufflepuff b = null;
        for (int i = 0; i < hufflepuffs.length; i++) {
            if (hufflepuffs[i].getName() == name1 && hufflepuffs[i].getSurname() == surname1) {
                a = hufflepuffs[i];
            }
        }
        for (int i = 0; i < hufflepuffs.length; i++) {
            if (hufflepuffs[i].getName() == name2 && hufflepuffs[i].getSurname() == surname2) {
                b = hufflepuffs[i];
            }
        }
        if (a.getHardWork() < b.getHardWork()) {
            System.out.println(a.getName() + " " + a.getSurname() + " трудолюбивие, чем " + b.getName() + " " + b.getSurname());
        } else if (b.getHardWork() < a.getHardWork()) {
            System.out.println(b.getName() + " " + b.getSurname() + " трудолюбивее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В трудолюбии они одинаковы");
        }
        if (a.getLoyalty() < b.getLoyalty()) {
            System.out.println("У " + a.getName() + " " + a.getSurname() + " больше верности, чем у  " + b.getName() + " " + b.getSurname());
        } else if (b.getLoyalty() < a.getLoyalty()) {
            System.out.println("У " + b.getName() + " " + b.getSurname() + " больше верности, чем у " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В верности они одинаковы");
        }
        if (a.getHonesty() < b.getHonesty()) {
            System.out.println(a.getName() + " " + a.getSurname() + " честнее, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getHonesty() < a.getHonesty()) {
            System.out.println(b.getName() + " " + b.getSurname() + " честнее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В честности они одинаковы");
        }
    }

    public static void comparisonStudentsOfSameFaculty(Ravenclaw[] ravenclaws, String name1, String surname1, String name2, String surname2) {
        Ravenclaw a = null;
        Ravenclaw b = null;
        for (int i = 0; i < ravenclaws.length; i++) {
            if (ravenclaws[i].getName() == name1 && ravenclaws[i].getSurname() == surname1) {
                a = ravenclaws[i];
            }
        }
        for (int i = 0; i < ravenclaws.length; i++) {
            if (ravenclaws[i].getName() == name2 && ravenclaws[i].getSurname() == surname2) {
                b = ravenclaws[i];
            }
        }
        if (a.getIntelligence() < b.getIntelligence())  {
            System.out.println(a.getName() + " " + a.getSurname() + " умнее, чем " + b.getName() + " " + b.getSurname());
        } else if (b.getIntelligence() < a.getIntelligence()) {
            System.out.println(b.getName() + " " + b.getSurname() + " умнее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("Ум у них одинаковый");
        }
        if (a.getWisdom() < b.getWisdom()) {
            System.out.println(a.getName() + " " + a.getSurname() + " мудрее, чем " + b.getName() + " " + b.getSurname());
        } else if (b.getWisdom() < a.getWisdom()) {
            System.out.println(b.getName() + " " + b.getSurname() + " мудрее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В мудрости они одинаковы");
        }
        if (a.getWit() < b.getWit()) {
            System.out.println(a.getName() + " " + a.getSurname() + " остроумнее, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getWit() < a.getWit()) {
            System.out.println(b.getName() + " " + b.getSurname() + " остроумнее, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В остроумии они одинаковы");
        }
        if (a.getCreativity() < b.getCreativity()) {
            System.out.println(a.getName() + " " + a.getSurname() + " более полон творчества, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getCreativity() < a.getCreativity()) {
            System.out.println(b.getName() + " " + b.getSurname() + " более полон творчества, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В полноте творчества они одинаковы");
        }
    }

    public static void comparisonStudents(Hogwarts[] hogwarts, String name1, String surname1, String name2, String surname2) {
        Hogwarts a = null;
        Hogwarts b = null;
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName() == name1 && hogwarts[i].getSurname() == surname1) {
                a = hogwarts[i];
            }
        }
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getName() == name2 && hogwarts[i].getSurname() == surname2) {
                b = hogwarts[i];
            }
        }
        if (a.getWitchcraft() < b.getWitchcraft()) {
            System.out.println(a.getName() + " " + a.getSurname() + " обладает большей мощностью магии, чем " + b.getName() + " " + b.getSurname());
        } else if (b.getWitchcraft() < a.getWitchcraft()) {
            System.out.println(b.getName() + " " + b.getSurname() + " обладает большей мощностью магии, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("В мощности магии они одинаковы");
        }
        if (a.getTransgressionKm() < b.getTransgressionKm()) {
            System.out.println(a.getName() + " " + a.getSurname() + " трансгрессирует дальше, чем  " + b.getName() + " " + b.getSurname());
        } else if (b.getTransgressionKm() < a.getTransgressionKm()) {
            System.out.println(b.getName() + " " + b.getSurname() + " трансгрессирует дальше, чем " + a.getName() + " " + a.getSurname());
        } else {
            System.out.println("Трансгрессируют на одинаковое расстояние");
        }
    }
}
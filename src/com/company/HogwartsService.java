package com.company;
public class HogwartsService {

    public static void printStudent(Hogwarts hogwarts) {
        System.out.println(hogwarts.getName() + " " + hogwarts.getSurname());
        System.out.println(hogwarts);
    }

    public static void comparisonStudentsOfSameFaculty(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1.getCourage() > gryffindor2.getCourage()) {
            System.out.println(gryffindor1.getName() + " " + gryffindor1.getSurname() + " благороднее, чем " + gryffindor2.getName() + " " + gryffindor2.getSurname());
        } else if (gryffindor2.getCourage() > gryffindor1.getCourage()) {
            System.out.println(gryffindor2.getName() + " " + gryffindor2.getSurname() + " благороднее, чем " + gryffindor1.getName() + " " + gryffindor1.getSurname());
        } else {
            System.out.println("В блогородности они одинаковы");
        }
        if (gryffindor1.getCourage() > gryffindor2.getCourage()) {
            System.out.println("У " + gryffindor1.getName() + " " + gryffindor1.getSurname() + " больше чести, чем у  " + gryffindor2.getName() + " " + gryffindor2.getSurname());
        } else if (gryffindor2.getCourage() > gryffindor1.getCourage()) {
            System.out.println("У " + gryffindor2.getName() + " " + gryffindor2.getSurname() + " больше чести, чем у " + gryffindor1.getName() + " " + gryffindor1.getSurname());
        } else {
            System.out.println("В чести они одинаковы");
        }
        if (gryffindor1.getCourage() > gryffindor2.getCourage()) {
            System.out.println(gryffindor1.getName() + " " + gryffindor1.getSurname() + " храбрее, чем  " + gryffindor2.getName() + " " + gryffindor2.getSurname());
        } else if (gryffindor2.getCourage() > gryffindor1.getCourage()) {
            System.out.println(gryffindor2.getName() + " " + gryffindor2.getSurname() + " храбрее, чем " + gryffindor1.getName() + " " + gryffindor1.getSurname());
        } else {
            System.out.println("В храбрости они одинаковы");
        }
    }

    public static void comparisonStudentsOfSameFaculty(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1.getCunning() > slytherin2.getCunning())  {
            System.out.println(slytherin1.getName() + " " + slytherin1.getSurname() + " хитрее, чем " + slytherin2.getName() + " " + slytherin2.getSurname());
        } else if (slytherin2.getCunning() > slytherin1.getCunning()) {
            System.out.println(slytherin2.getName() + " " + slytherin2.getSurname() + " хитрее, чем " + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("В хитрости они одинаковы");
        }
        if (slytherin1.getDetermination() > slytherin2.getDetermination()) {
            System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() + " больше решительности, чем у  " + slytherin2.getName() + " " + slytherin2.getSurname());
        } else if (slytherin2.getDetermination() > slytherin1.getDetermination()) {
            System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() + " больше решительности, чем у " + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("В решительности они одинаковы");
        }
        if (slytherin1.getAmbition() > slytherin2.getAmbition()) {
            System.out.println(slytherin1.getName() + " " + slytherin1.getSurname() + " амбициознее, чем  " + slytherin2.getName() + " " + slytherin2.getSurname());
        } else if (slytherin2.getAmbition() > slytherin1.getAmbition()) {
            System.out.println(slytherin2.getName() + " " + slytherin2.getSurname() + " амбициознее, чем " + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("В амбициозности они одинаковы");
        }
        if (slytherin1.getResourcefulness() > slytherin2.getResourcefulness()) {
            System.out.println(slytherin1.getName() + " " + slytherin1.getSurname() + " находчивее, чем  " + slytherin2.getName() + " " + slytherin2.getSurname());
        } else if (slytherin2.getResourcefulness() > slytherin1.getResourcefulness()) {
            System.out.println(slytherin2.getName() + " " + slytherin2.getSurname() + " находчивее, чем " + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("В находчивости они одинаковы");
        }
        if (slytherin1.getLustForPower() > slytherin2.getLustForPower()) {
            System.out.println(slytherin1.getName() + " " + slytherin1.getSurname() + " жажда власти больше, чем  " + slytherin2.getName() + " " + slytherin2.getSurname());
        } else if (slytherin2.getLustForPower() > slytherin1.getLustForPower()) {
            System.out.println(slytherin2.getName() + " " + slytherin2.getSurname() + " жажда власти больше, чем " + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("В жажде власти они одинаковы");
        }
    }

    public static void comparisonStudentsOfSameFaculty(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (hufflepuff1.getHardWork() < hufflepuff2.getHardWork()) {
            System.out.println(hufflepuff1.getName() + " " + hufflepuff1.getSurname() + " трудолюбивие, чем " + hufflepuff2.getName() + " " + hufflepuff2.getSurname());
        } else if (hufflepuff2.getHardWork() < hufflepuff1.getHardWork()) {
            System.out.println(hufflepuff2.getName() + " " + hufflepuff2.getSurname() + " трудолюбивее, чем " + hufflepuff1.getName() + " " + hufflepuff1.getSurname());
        } else {
            System.out.println("В трудолюбии они одинаковы");
        }
        if (hufflepuff1.getLoyalty() < hufflepuff2.getLoyalty()) {
            System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() + " больше верности, чем у  " + hufflepuff2.getName() + " " + hufflepuff2.getSurname());
        } else if (hufflepuff2.getLoyalty() < hufflepuff1.getLoyalty()) {
            System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() + " больше верности, чем у " + hufflepuff1.getName() + " " + hufflepuff1.getSurname());
        } else {
            System.out.println("В верности они одинаковы");
        }
        if (hufflepuff1.getHonesty() < hufflepuff2.getHonesty()) {
            System.out.println(hufflepuff1.getName() + " " + hufflepuff1.getSurname() + " честнее, чем  " + hufflepuff2.getName() + " " + hufflepuff2.getSurname());
        } else if (hufflepuff2.getHonesty() < hufflepuff1.getHonesty()) {
            System.out.println(hufflepuff2.getName() + " " + hufflepuff2.getSurname() + " честнее, чем " + hufflepuff1.getName() + " " + hufflepuff1.getSurname());
        } else {
            System.out.println("В честности они одинаковы");
        }
    }

    public static void comparisonStudentsOfSameFaculty(Ravenclaw ravenclaws1,Ravenclaw ravenclaws2) {
        if (ravenclaws1.getIntelligence() > ravenclaws2.getIntelligence())  {
            System.out.println(ravenclaws1.getName() + " " + ravenclaws1.getSurname() + " умнее, чем " + ravenclaws2.getName() + " " + ravenclaws2.getSurname());
        } else if (ravenclaws2.getIntelligence() > ravenclaws1.getIntelligence()) {
            System.out.println(ravenclaws2.getName() + " " + ravenclaws2.getSurname() + " умнее, чем " + ravenclaws1.getName() + " " + ravenclaws1.getSurname());
        } else {
            System.out.println("Ум у них одинаковый");
        }
        if (ravenclaws1.getWisdom() > ravenclaws2.getWisdom()) {
            System.out.println(ravenclaws1.getName() + " " + ravenclaws1.getSurname() + " мудрее, чем " + ravenclaws2.getName() + " " + ravenclaws2.getSurname());
        } else if (ravenclaws2.getWisdom() > ravenclaws1.getWisdom()) {
            System.out.println(ravenclaws2.getName() + " " + ravenclaws2.getSurname() + " мудрее, чем " + ravenclaws1.getName() + " " + ravenclaws1.getSurname());
        } else {
            System.out.println("В мудрости они одинаковы");
        }
        if (ravenclaws1.getWit() > ravenclaws2.getWit()) {
            System.out.println(ravenclaws1.getName() + " " + ravenclaws1.getSurname() + " остроумнее, чем  " + ravenclaws2.getName() + " " + ravenclaws2.getSurname());
        } else if (ravenclaws2.getWit() > ravenclaws1.getWit()) {
            System.out.println(ravenclaws2.getName() + " " + ravenclaws2.getSurname() + " остроумнее, чем " + ravenclaws1.getName() + " " + ravenclaws1.getSurname());
        } else {
            System.out.println("В остроумии они одинаковы");
        }
        if (ravenclaws1.getCreativity() > ravenclaws2.getCreativity()) {
            System.out.println(ravenclaws1.getName() + " " + ravenclaws1.getSurname() + " более полон творчества, чем  " + ravenclaws2.getName() + " " + ravenclaws2.getSurname());
        } else if (ravenclaws2.getCreativity() > ravenclaws1.getCreativity()) {
            System.out.println(ravenclaws2.getName() + " " + ravenclaws2.getSurname() + " более полон творчества, чем " + ravenclaws1.getName() + " " + ravenclaws1.getSurname());
        } else {
            System.out.println("В полноте творчества они одинаковы");
        }
    }

    public static void comparisonStudents(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.getWitchcraft() > hogwarts2.getWitchcraft()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + " обладает большей мощностью магии, чем " + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts2.getWitchcraft() > hogwarts1.getWitchcraft()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " обладает большей мощностью магии, чем " + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println("В мощности магии они одинаковы");
        }
        if (hogwarts1.getTransgressionKm() > hogwarts2.getTransgressionKm()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + " трансгрессирует дальше, чем  " + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts2.getTransgressionKm() > hogwarts1.getTransgressionKm()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " трансгрессирует дальше, чем " + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println("Трансгрессируют на одинаковое расстояние");
        }
    }
}
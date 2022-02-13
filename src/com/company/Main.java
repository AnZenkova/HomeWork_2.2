package com.company;

public class Main {

    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Gryffindor("Гарри","Поттер", 80, 5,90,85,100),
                new Gryffindor("Гермиона","Грейнжер", 99, 99,85,90,90),
                new Gryffindor("Рон","Уизли", 60, 3,85,85,85),
                new Slytherin("Драко", "Малфой", 75, 50, 60, 60, 85, 90, 90),
                new Slytherin("Грэхэм", "Монтегю", 50, 30, 70, 70, 80, 60, 90),
                new Slytherin("Грегори", "Гойл", 60, 20, 30, 90, 80, 50, 85),
                new Hufflepuff("Захария", "Смит", 75, 70, 85, 75,80),
                new Hufflepuff("Седрик", "Диггори", 88, 100, 95, 66,89),
                new Hufflepuff("Джастин", "Флин-Флетчер", 38, 55, 65, 87,65),
                new Ravenclaw("Чжоу","Чанг", 54,46,98,12,68,46),
                new Ravenclaw("Падма","Патил", 12,48,86,48,15,48),
                new Ravenclaw("Маркус","Белби", 48,76,87,56,49,83),
        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри","Поттер", 80, 5,90,85,100),
                new Gryffindor("Гермиона","Грейнжер", 99, 99,85,90,90),
                new Gryffindor("Рон","Уизли", 60, 3,85,85,85),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 75, 50, 60, 60, 85, 90, 90),
                new Slytherin("Грэхэм", "Монтегю", 50, 30, 70, 70, 80, 60, 90),
                new Slytherin("Грегори", "Гойл", 60, 20, 30, 90, 80, 50, 85),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 75, 70, 85, 75,80),
                new Hufflepuff("Седрик", "Диггори", 88, 100, 95, 66,89),
                new Hufflepuff("Джастин", "Флин-Флетчер", 38, 55, 65, 87,65),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу","Чанг", 54,46,98,12,68,46),
                new Ravenclaw("Падма","Патил", 12,48,86,48,15,48),
                new Ravenclaw("Маркус","Белби", 48,76,87,56,49,83),
        };
        HogwartsService.printStudent(hogwarts,"Драко","Малфой");
        HogwartsService.comparisonStudentsOfSameFaculty(gryffindors, "Гарри", "Поттер", "Гермиона", "Грейнжер");
        HogwartsService.comparisonStudentsOfSameFaculty(slytherins, "Драко", "Малфой", "Грэхэм", "Монтегю");
        HogwartsService.comparisonStudentsOfSameFaculty(hufflepuffs,"Седрик", "Диггори","Джастин", "Флин-Флетчер");
        HogwartsService.comparisonStudentsOfSameFaculty(ravenclaws,"Чжоу","Чанг", "Маркус","Белби");
        HogwartsService.comparisonStudents(hogwarts,"Падма","Патил","Грэхэм", "Монтегю");
    }
}

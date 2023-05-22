package JavaCore.OOPEncapsulationAndInheritance;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 6, 7,
                        90, 85, 70),
                new Gryffindor("Hermione Granger", 5, 6,
                        95, 80, 65),
                new Gryffindor("Ron Weasley", 4, 3,
                        85, 70, 60)
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 4, 2,
                        90, 80, 95, 90, 90),
                new Slytherin("Graham Montagu", 3, 2,
                        60, 70, 50, 70, 30),
                new Slytherin("Gregory Goyle", 3, 1,
                        70, 60, 70, 55, 40)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zacharias Smith", 4, 4,
                        70, 80, 90),
                new Hufflepuff("Cedric Diggory", 3, 5,
                        90, 70, 50),
                new Hufflepuff("Justin Finch-Fletchley", 4, 5,
                        80, 75, 80)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang", 2, 6,
                        90, 80, 90, 90),
                new Ravenclaw("Padma Patil", 1, 4,
                        80, 85, 85, 70),
                new Ravenclaw("Marcus Belby", 3, 7,
                        85, 90, 80, 80)
        };
        PrintInfo printInfo = new PrintInfo();
        printInfo.printStudentInfo(gryffindors, "Harry Potter");
        printInfo.printStudentInfo(slytherins, "Draco Malfoy");
        printInfo.printStudentInfo(hufflepuffs, "Justin Finch-Fletchley");
        printInfo.printStudentInfo(ravenclaws, "Marcus Belby");

        printInfo.compareTwoGryffindorsStudents(gryffindors, "Hermione Granger", "Ron Weasley");
        printInfo.compareTwoHufflepuffsStudents(hufflepuffs, "Zacharias Smith", "Justin Finch-Fletchley");
        printInfo.compareTwoRavenclawsStudents(ravenclaws, "Padma Patil", "Marcus Belby");
        printInfo.compareTwoSlytherinsStudents(slytherins, "Draco Malfoy", "Gregory Goyle");

        printInfo.compareTwoHogwartssStudents(gryffindors, "Harry Potter", slytherins, "Draco Malfoy");
        printInfo.compareTwoHogwartssStudents(ravenclaws, "Marcus Belby", hufflepuffs, "Cedric Diggory");
        printInfo.compareTwoHogwartssStudents(gryffindors, "Hermione Granger", slytherins, "Graham Montagu");
    }
}
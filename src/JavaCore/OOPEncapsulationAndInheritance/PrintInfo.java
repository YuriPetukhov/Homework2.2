package JavaCore.OOPEncapsulationAndInheritance;

public class PrintInfo {
    public void printStudentInfo(Hogwarts[] hogwarts, String name){
        for(int i = 0; i < hogwarts.length; i++) {
            if(hogwarts[i].getName().equals(name)) {
                System.out.println(hogwarts[i].toString());
            }
        }
    }
    public void compareTwoGryffindorsStudents (Gryffindor[] gryffindors, String name1, String name2){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < gryffindors.length; i++){
            if(gryffindors[i].getName().equals(name1)) {
                sum1 = gryffindors[i].getNobility() + gryffindors[i].getCourage() + gryffindors[i].getHonor();
            }
            if(gryffindors[i].getName().equals(name2)) {
                sum2 = gryffindors[i].getNobility() + gryffindors[i].getCourage() + gryffindors[i].getHonor();
            }
        }
        if (sum1 > sum2){
            System.out.println(name1 + " is a better Gryffindor than " + name2);
        } else if (sum1 < sum2){
            System.out.println(name2 + " is a better Gryffindor than " + name1);
        }
        else {
            System.out.println(name1 + " and " + name2 + " both good Gryffindors");
        }
    }
    public void compareTwoHufflepuffsStudents (Hufflepuff[] hufflepuffs, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            if (hufflepuffs[i].getName().equals(name1)) {
                sum1 = hufflepuffs[i].getDiligence() + hufflepuffs[i].getFidelity() + hufflepuffs[i].getHonesty();
            }
            if (hufflepuffs[i].getName().equals(name2)) {
                sum2 = hufflepuffs[i].getDiligence() + hufflepuffs[i].getFidelity() + hufflepuffs[i].getHonesty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " is a better Hufflepuff than " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " is a better Hufflepuff than " + name1);
        } else {
            System.out.println(name1 + " and " + name2 + " both good Hufflepuffs");
        }
    }
    public void compareTwoRavenclawsStudents (Ravenclaw[] ravenclaws, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            if (ravenclaws[i].getName().equals(name1)) {
                sum1 = ravenclaws[i].getIntelligence() + ravenclaws[i].getWisdom() + ravenclaws[i].getWit()
                        + ravenclaws[i].getCreativity();
            }
            if (ravenclaws[i].getName().equals(name2)) {
                sum2 = ravenclaws[i].getIntelligence() + ravenclaws[i].getWisdom() + ravenclaws[i].getWit()
                        + ravenclaws[i].getCreativity();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " is a better Ravenclaw than " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " is a better Ravenclaw than " + name1);
        } else {
            System.out.println(name1 + " and " + name2 + " both good Ravenclaws");
        }
    }
    public void compareTwoSlytherinsStudents (Slytherin[] slytherins, String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < slytherins.length; i++) {
            if (slytherins[i].getName().equals(name1)) {
                sum1 = slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbitionint()
                        + slytherins[i].getResourcefulness() + slytherins[i].getLustForPower();
            }
            if (slytherins[i].getName().equals(name2)) {
                sum2 = slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbitionint()
                        + slytherins[i].getResourcefulness() + slytherins[i].getLustForPower();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " is a better Slytherin than " + name2);
        } else if (sum1 < sum2) {
            System.out.println(name2 + " is a better Slytherin than " + name1);
        } else {
            System.out.println(name1 + " and " + name2 + " both good Slytherins");
        }
    }
    public void compareTwoHogwartssStudents (Hogwarts[] hogwarts1, String name1, Hogwarts[] hogwarts2, String name2) {
        int apparateDistance1 = 0;
        int apparateDistance2 = 0;
        int magicPower1 = 0;
        int magicPower2 = 0;
        for (int i = 0; i < hogwarts1.length; i++){
            if (hogwarts1[i].getName().equals(name1)) {
                apparateDistance1 = hogwarts1[i].getApparateDistance();
                magicPower1 = hogwarts1[i].getMagicPower();
            }
            if (hogwarts2[i].getName().equals(name2)) {
                apparateDistance2 = hogwarts2[i].getApparateDistance();
                magicPower2 = hogwarts1[i].getMagicPower();
            }
        }
        if (magicPower1 > magicPower2) {
            System.out.println(name1 + " has more magic power than " + name2);
        } else if (magicPower1 < magicPower2) {
            System.out.println(name2 + " has more magic power than " + name1);
        } else {
            System.out.println(name1 + " and " + name2 + " have the same magic power");
        }
        if (apparateDistance1 > apparateDistance2) {
            System.out.println(name1 + " has more transgression distance than " + name2);
        } else if (apparateDistance1 < apparateDistance2) {
            System.out.println(name2 + " has more transgression distance than " + name1);
        } else {
            System.out.println(name1 + " and " + name2 + " have the same transgression distance");
        }
    }
}

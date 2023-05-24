package JavaCore.OOPEncapsulationAndInheritance;

public class PrintInfo {
    public void printStudentInfo(Hogwarts[] hogwarts, String name){
        for (Hogwarts hogwart : hogwarts) {
            if (hogwart.getName().equals(name)) {
                System.out.println(hogwart.toString());
            }
        }
    }
    public void compareTwoGryffindorsStudents (Gryffindor[] gryffindors, String name1, String name2){
        int sum1 = 0;
        int sum2 = 0;
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(name1)) {
                sum1 = gryffindor.getNobility() + gryffindor.getCourage() + gryffindor.getHonor();
            }
            if (gryffindor.getName().equals(name2)) {
                sum2 = gryffindor.getNobility() + gryffindor.getCourage() + gryffindor.getHonor();
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
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(name1)) {
                sum1 = hufflepuff.getDiligence() + hufflepuff.getFidelity() + hufflepuff.getHonesty();
            }
            if (hufflepuff.getName().equals(name2)) {
                sum2 = hufflepuff.getDiligence() + hufflepuff.getFidelity() + hufflepuff.getHonesty();
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
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(name1)) {
                sum1 = ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit()
                        + ravenclaw.getCreativity();
            }
            if (ravenclaw.getName().equals(name2)) {
                sum2 = ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit()
                        + ravenclaw.getCreativity();
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
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(name1)) {
                sum1 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbitionint()
                        + slytherin.getResourcefulness() + slytherin.getLustForPower();
            }
            if (slytherin.getName().equals(name2)) {
                sum2 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbitionint()
                        + slytherin.getResourcefulness() + slytherin.getLustForPower();
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
        int i = 0;
        while (i < hogwarts1.length) {
            if (hogwarts1[i].getName().equals(name1)) {
                apparateDistance1 = hogwarts1[i].getApparateDistance();
                magicPower1 = hogwarts1[i].getMagicPower();
            }
            if (hogwarts2[i].getName().equals(name2)) {
                apparateDistance2 = hogwarts2[i].getApparateDistance();
                magicPower2 = hogwarts1[i].getMagicPower();
            }
            i++;
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

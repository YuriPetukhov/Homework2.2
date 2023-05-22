package JavaCore.OOPEncapsulationAndInheritance;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int apparateDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, apparateDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw's student " +getName() + ", magicPower = " + getMagicPower() +
                ", apparateDistance = " + getApparateDistance() +
                ", intelligence = " + intelligence +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creativity = " + creativity;
    }
}

package JavaCore.OOPEncapsulationAndInheritance;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int apparateDistance;

    public Hogwarts(String name, int magicPower, int apparateDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.apparateDistance = apparateDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getApparateDistance() {
        return apparateDistance;
    }

    public void setApparateDistance(int apparateDistance) {
        this.apparateDistance = apparateDistance;
    }

    public void doMagic(Hogwarts hogwarts){
        System.out.println("I can do magic and my power of magic is " + "magicPower" + " points");
    }
    public static void apparate(String name){
        System.out.println("I am able to apparate a distance of " + "apparateDistance" + " km");
    }

}

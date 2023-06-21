package JavaCore.OOPEncapsulationAndInheritance;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambitionint;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int apparateDistance, int cunning, int determination, int ambitionint, int resourcefulness, int lustForPower) {

        super(name, magicPower, apparateDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitionint = ambitionint;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitionint() {
        return ambitionint;
    }

    public void setAmbitionint(int ambitionint) {
        this.ambitionint = ambitionint;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin's student " + getName() + ", magic power = " + getMagicPower() +
                ", apparate distance = " + getApparateDistance() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambitionint=" + ambitionint +
                ", resourcefulness=" + resourcefulness +
                ", lust for power=" + lustForPower;
    }
}

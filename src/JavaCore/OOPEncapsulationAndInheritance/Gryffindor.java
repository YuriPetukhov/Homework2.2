package JavaCore.OOPEncapsulationAndInheritance;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicPower, int apparateDistance, int nobility, int honor, int courage) {
        super(name, magicPower, apparateDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    @Override
    public String toString() {
        return "Gryffindor's student " + getName() + ", magicPower = " + getMagicPower() +
                ", apparateDistance = " + getApparateDistance() +
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", courage = " + courage;
    }
}

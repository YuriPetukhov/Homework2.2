package JavaCore.OOPEncapsulationAndInheritance;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int fidelity;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int apparateDistance, int diligence, int fidelity, int honesty) {
        super(name, magicPower, apparateDistance);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }
    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff's student " + getName() + ", magic power = " + getMagicPower() +
                ", apparate distance = " + getApparateDistance() +
                ", diligence = " + diligence +
                ", fidelity = " + fidelity +
                ", honesty = " + honesty;
    }
}

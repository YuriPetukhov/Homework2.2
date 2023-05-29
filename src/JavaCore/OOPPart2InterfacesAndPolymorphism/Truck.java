package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class Truck extends MeansOfTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

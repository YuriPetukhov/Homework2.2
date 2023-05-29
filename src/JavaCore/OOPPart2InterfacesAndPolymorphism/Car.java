package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class Car extends MeansOfTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

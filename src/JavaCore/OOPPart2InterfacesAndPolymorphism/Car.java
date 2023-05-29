package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class Car extends MeansOfTransport implements EngineCheckable {
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

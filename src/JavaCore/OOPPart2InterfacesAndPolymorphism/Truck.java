package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class Truck extends MeansOfTransport implements EngineCheckable{
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
}

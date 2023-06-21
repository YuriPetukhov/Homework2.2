package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class Car extends MeansOfTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(){
        super.service();
        checkEngine();
    }
}

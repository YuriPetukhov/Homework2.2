package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class Truck extends MeansOfTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }
}

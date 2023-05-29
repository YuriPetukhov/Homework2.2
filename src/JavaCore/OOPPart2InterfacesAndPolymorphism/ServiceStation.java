package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class ServiceStation {
    public void check(MeansOfTransport meansOfTransport) {
        if (meansOfTransport != null) {
            System.out.println("Обслуживаем " + meansOfTransport.getModelName());
            for (int i = 0; i < meansOfTransport.getWheelsCount(); i++) {
                meansOfTransport.updateTyre();
            }
            meansOfTransport.checkEngine();
            meansOfTransport.checkTrailer();
        }
    }
}

package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class ServiceStation {
    public void check(MeansOfTransport meansOfTransport) {
        if (meansOfTransport != null) {
            print(meansOfTransport);
            for (int i = 0; i < meansOfTransport.getWheelsCount(); i++) {
                meansOfTransport.updateTyre();
            }
            meansOfTransport.checkEngine();
            meansOfTransport.checkTrailer();

        }
    }

    public void print(MeansOfTransport meansOfTransport) {
        System.out.println("Обслуживаем " + meansOfTransport.getModelName());
    }
}

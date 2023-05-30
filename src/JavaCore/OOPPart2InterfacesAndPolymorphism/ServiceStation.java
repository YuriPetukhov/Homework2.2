package JavaCore.OOPPart2InterfacesAndPolymorphism;

public class ServiceStation {
    public void check(MeansOfTransport meansOfTransport) {
        System.out.println("Обслуживаем " + meansOfTransport.getModelName());
        meansOfTransport.service();
    }
}
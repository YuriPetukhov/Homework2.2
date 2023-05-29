package JavaCore.OOPPart2InterfacesAndPolymorphism;

public abstract class MeansOfTransport {
    private String modelName;
    private int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

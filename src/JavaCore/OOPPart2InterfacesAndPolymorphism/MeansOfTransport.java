package JavaCore.OOPPart2InterfacesAndPolymorphism;

public abstract class MeansOfTransport{
    private String modelName;
    private int wheelsCount;

    public MeansOfTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

}

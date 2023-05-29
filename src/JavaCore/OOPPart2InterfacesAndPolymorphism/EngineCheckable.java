package JavaCore.OOPPart2InterfacesAndPolymorphism;

public interface EngineCheckable {
    default void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}

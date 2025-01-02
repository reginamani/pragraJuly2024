package sep28;

@FunctionalInterface
public interface ICalculator {

    void calculate();

    default void run(){
        System.out.println("running");
    }
    default void play(){
        System.out.println("play in basic cal");
    }
}

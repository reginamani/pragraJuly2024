package sep28;

@FunctionalInterface
public interface ISciCalculator {

    int calculate(int a, int b);

    default void play(){
        System.out.println("play in Scientific");
    }

}

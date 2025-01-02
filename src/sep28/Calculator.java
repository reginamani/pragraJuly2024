package sep28;

public class Calculator implements ICalculator {

    @Override
    public void calculate() {
        System.out.println("Calculating");
    }

    @Override
    public void play() {
        ICalculator.super.play();
        //ISciCalculator.super.play();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
        calculator.play();
    }
}

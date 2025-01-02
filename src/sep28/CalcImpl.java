package sep28;

public class CalcImpl {

    public static void main(String[] args) {

     //anonymous class for implementing interface
/*        ICalculator calculator = new ICalculator() {
            @Override
            public void calculate() {
                System.out.println("calculating from anonymous");
            }
        };

        calculator.calculate();*/

        ISciCalculator sciCalculator = (x,y) ->  {
            System.out.println(x+y);
           return x+y;
        };

        sciCalculator.calculate(2,2);

        //ICalculator calculator1 = ()-> System.out.println("calculating from lambda");

        //calculator1.calculate();
    }
}

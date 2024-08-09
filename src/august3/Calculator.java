package august3;

public class Calculator {

    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){

        if(b ==0){
            throw new ArithmeticException("number not divisible by zero");
        }
        return a/b;
    }
    public double modulus(double a, double b){
        return a%b;
    }
}

package sep7;

class Calc {

    double result;

    public double add(double a,double b){
        return a+b;
    }
    public double subtract(double a,double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double divide(double a,double b){

        try {
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        return result;

    }
}

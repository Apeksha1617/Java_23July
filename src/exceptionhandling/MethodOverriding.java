package exceptionhandling;

public class MethodOverriding {

    public void show() throws RuntimeException{
        System.out.println("In show");
    }
}

class Sample extends MethodOverriding{
    @Override
    public void show() throws ArithmeticException {
        super.show();
    }
    public static void main(String[] args){

    }
}
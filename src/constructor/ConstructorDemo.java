package constructor;

import java.util.concurrent.Callable;

public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("In const");
    }

    public ConstructorDemo(int i) {
        System.out.println("In the parameter constructor");
    }
    public static void main(String[] args){
        ConstructorDemo obj = new ConstructorDemo();
        System.out.println(obj);
    }
}

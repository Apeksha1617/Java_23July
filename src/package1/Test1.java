package package1;

import encapsulation.EncapsulationDemo;

public class Test1 {

    protected int i = 10; //member variable

    public void show() { //member function

    }

    private class Test{ //member class

    }
    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);

        EncapsulationDemo obj1 = new EncapsulationDemo();
        obj1.setId(1);

    }

}

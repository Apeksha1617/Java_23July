package superdemo;

public class SuperDemo {
    int i = 10;
    public void show() {
        System.out.println("in show");
    }
    public SuperDemo() {
        System.out.println("In super Demo const");
    }
    public SuperDemo(int i){
        super();
        System.out.println("In super Demo parameter");
    }
}

class A extends SuperDemo {
    int i = 5;

    public void display() {
        System.out.println(super.i);
        System.out.println(i);
        super.show();
    }

    public A() {
        super(8);
        System.out.println("in A const");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}

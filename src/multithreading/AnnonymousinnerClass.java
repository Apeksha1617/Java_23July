package multithreading;

public class AnnonymousinnerClass{
    public static void main(String[] args) {

        AnnonymousinnerClass obj = new AnnonymousinnerClass();

        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("in show");
            }

        };

        MyInterface myInterface1= ()-> {
            System.out.println("in show");
        };
    }
}

interface MyInterface{

    void show();

}

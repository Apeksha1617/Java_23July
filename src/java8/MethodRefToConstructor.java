package java8;

public class MethodRefToConstructor {
    //Method Reference to Constructor method
    public MethodRefToConstructor(){
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
     
        //refer
        MyInterface4 myInterface4 = MethodRefToConstructor::new;
        myInterface4.getCon();
    }
}

interface MyInterface4{
    MethodRefToConstructor getCon();
}
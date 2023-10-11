package java8;

public class MethodRefToStatic {
    //Method Reference to Static method
    public static void main(String[] args) {

        //refer
        MyInterface3 myInterface3 = MethodRefToStatic::display;

        //call
        System.out.println(myInterface3.show());
    }
    public static String display(){
        return"Hii";
    }
}
interface MyInterface3{
    String show();
}
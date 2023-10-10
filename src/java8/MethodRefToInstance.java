package java8;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;

public class MethodRefToInstance {
    //Method Refrence to Instance method
    public static void main(String[] args) {
        MethodRefToInstance methodRefToInstance = new MethodRefToInstance();

        //refer
        MyInterface2 myInterface2 = methodRefToInstance::display;

        //call
        System.out.println(myInterface2.show());

        List<Integer> list = Arrays.asList(1,2,3);
        list.forEach(System.out::println);
    }
    public String display(){
        return"Hii";
    }
}

interface MyInterface2{
    String show();
}
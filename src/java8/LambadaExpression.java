package java8;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class LambadaExpression {
    public static void main(String[] args)  {
        MyInterface myInterface = ()-> {
            System.out.println("In Show");
        };
        MyInterface1 myInterface1 = (i, j)-> {
            return i + j;
        };
    }
}

interface MyInterface{
    void show();
}
interface MyInterface1{
    int add(int i, int j);
}

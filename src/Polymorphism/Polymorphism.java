package Polymorphism;

import inheritance.College;

public class Polymorphism {

public static void main(String[] args) {
    Polymorphism obj = new Polymorphism();
    obj.add(34,1.2);
}
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, double g) {
        return a + g;

    }

    public College getCollege() {
        return new College();
    }

}

package Polymorphism;

public class Animal {
    public void sound() {
        System.out.println("In animal sound");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat sound");
    }


    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }
}
package exceptionhandling;

public class ThrowandThrows {

    public static void main(String[] args)throws Exception {

        int age = 15;
        if(age>=18){
            System.out.println("You can Vote");
        } else {
            throw new Exception("You cannot vote");
        }

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

    }
}

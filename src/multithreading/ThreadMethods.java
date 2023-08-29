package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("In Thread t1");
        });
        t1.setName("Test");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        System.out.println(t1.isAlive());
    }
}

package multithreading;

public class YeildDemo extends Thread{

    @Override
    public void run() {
        Thread.yield();
        for(int i=1; i<5; i++){
            System.out.println("In Run Method");
        }
    }

    public static void main(String[] args) {
        YeildDemo obj = new YeildDemo();
        obj.start();
        for(int i=1;i<5;i++){
            System.out.println("In Main Method");
        }
    }
}

package abstraction;

public class Football implements Sports {

    @Override
    public void play() {
        System.out.println("Play");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
    }
}

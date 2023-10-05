package abstraction.abstractdemo;

public class Cricket extends AbsSports{
    @Override
    public void play() {

    }

    public static void main(String[] args) {

        Cricket obj =  new Cricket();
        obj.show();
        obj.play();
    }
}

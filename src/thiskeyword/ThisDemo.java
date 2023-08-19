package thiskeyword;

public class ThisDemo {

    private int id; //instance variable

    private String name;

    private String address;

    public ThisDemo(int id, String name, String address) {  //parameter constructor
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public ThisDemo() {  //default constructor
        this(1,"Apeksha", "Pune");
    }
    public void show() {
        System.out.println("in show");
    }
    public void setId(int id) {
        this.id = id; // local variable
        this.show();
    }

    public void display(Test test){
        System.out.println(test);
    }



    public static void main(String[] args) {

        ThisDemo obj = new ThisDemo();
      //  obj.setId(5);

        //System.out.println(obj.id);
    }

}

class Test{
    public void sample(){
        ThisDemo obj = new ThisDemo();
        obj.display(this);
    }

    public Test a(){
        return this;
    }

    public static void main(String[] args) {

    }
}
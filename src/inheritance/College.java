package inheritance;

public class College {

    int id;
    String name;
    String address;

    public static void main(String[] args) {

        College obj = new College();
        obj.id = 1;
        obj.name = "ABC";
        obj.address = "Pune";

        System.out.println(obj.id+" "+obj.name+" "+obj.address);

    }
}

class Student extends College {

    public static void main(String[] args) {

        Student obj = new Student();
        obj.id = 2;
        obj.name = "Apeksha";
        obj.address = "Pune";

        System.out.println(obj.id + " " + obj.name + " " + obj.address);

    }
}

class Teacher extends College {

    public static void main(String[] args) {

        Teacher obj = new Teacher();
        obj.id = 2;
        obj.name = "Parth";
        obj.address = "Pune";

        System.out.println(obj.id+" "+obj.name+" "+obj.address);
    }
}

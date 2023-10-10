package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefArbitoryObject {
    //Method Reference to Arbitory Object of particular type
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("Parth"), new Employee("Apeksha"));

        list.forEach(Employee::getName);
    }
    static class Employee{
        String name;
        public Employee(String name){
            this.name = name;
        }

        public String getName() {
            System.out.println("name=" +name);
            return name;
        }
    }
}


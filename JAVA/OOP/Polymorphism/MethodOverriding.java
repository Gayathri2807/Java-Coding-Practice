class Person {
    void role() {
        System.out.println("I'm a person");
    }
}

class Father extends Person {
    @Override
    void role() {
        System.out.println("I'm a father, caring for my children");
    }
}

class Husband extends Person {
    @Override
    void role() {
        System.out.println("I'm a husband, supporting my spouse");
    }
}

class Employee extends Person {
    @Override
    void role() {
        System.out.println("I'm an employee, working in a company");
    }
}   

public class MethodOverriding {
    public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Father();
            Person p3 = new Husband();
            Person p4 = new Employee();

            p1.role();
            p2.role();
            p3.role();
            p4.role();
    }
}

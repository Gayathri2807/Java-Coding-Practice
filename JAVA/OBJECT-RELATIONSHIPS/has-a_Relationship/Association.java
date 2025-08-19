class Car {
    void drive() {
        System.out.println("Car is being driven");
    }
}
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    //Association: Person uses Car, but does not own it permanently
    void useCar(Car car) {
        System.out.println(name + " is using the car");
        car.drive();
    }
}

public class Association {
    public static void main(String[] args) {
        Person person = new Person("Gayathri");
        Car car = new Car();
        person.useCar(car); //Association happens here
    }
}

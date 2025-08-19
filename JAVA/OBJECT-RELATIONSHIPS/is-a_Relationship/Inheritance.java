class Vehicle {
    void move() {
        System.out.println("The vehicle is moving");
    }
}
class Car extends Vehicle {
    void  playMusic() {
        System.out.println("Playing music in the car");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.playMusic();
    }
}

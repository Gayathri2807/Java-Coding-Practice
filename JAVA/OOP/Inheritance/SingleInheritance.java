//Parent/Super class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

//Child/Sub Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //Inherited from Animal
        dog.bark(); //Own method
    }
}
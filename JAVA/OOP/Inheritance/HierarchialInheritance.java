
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //Inherited from Animal
        dog.bark(); //Own method

        Cat cat = new Cat();
        cat.eat(); //Inherited from Animal
        cat.meow(); //Own method
    }
}
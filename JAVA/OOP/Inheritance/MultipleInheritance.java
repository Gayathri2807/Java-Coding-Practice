interface Father {
    default void skills() {
        System.out.println("Can drive");
    }
}

interface Mother {
    default void skills() {
        System.out.println("Can cook");
    }
}

class Child implements Father, Mother {
    public void skills() {
        System.out.println("Child has multiple skills");
        Father.super.skills();
        Mother.super.skills();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.skills();
    }
}

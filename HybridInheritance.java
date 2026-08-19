class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

interface Pet {
    void play();
}

interface Guard {
    void protect();
}

class Dog extends Animal implements Pet, Guard {

    public void play() {
        System.out.println("Dog plays");
    }

    public void protect() {
        System.out.println("Dog protects the house");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.play();
        d.protect();
    }
}
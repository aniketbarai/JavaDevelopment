package EncapsulationJava;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is Barking....");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing....");
    }
}

public class overrinding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

    }
}

package OOPsJava.InheritenceJava;
class Parent {
    String name;
    int age;

    void p() {
        System.out.println("I am from Parent Class");
    }
}

class Child extends Parent {
    void c() {
        System.out.println("I am from Child Class");
    }

    void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "aniket";
        c1.age = 17;
        c1.getInfo();

    }
}

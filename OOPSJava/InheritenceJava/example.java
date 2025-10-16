class Employee {
    int salary = 74000;

    void emp() {
        System.out.println("I am Employee");
    }
}

class Programmar extends Employee {
    int bonus = 14000;

    void getInfo() {
        System.out.println("My Salary: " + (salary + bonus));
    }
}

class Developer extends Employee {
    int bonus = 16000;

    void getInfo() {
        System.out.println("My Salary: " + (salary + bonus));
    }
}

public class example {
    public static void main(String[] args) {
        Programmar p1 = new Programmar();
        p1.getInfo();
    }
}

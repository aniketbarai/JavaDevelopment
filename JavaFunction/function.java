import java.util.*;

public class function {
    public static void main(String[] args) {
        // System.out.println("Hello");
        // Q. take input of 2 numbers and print the sum

        Scanner sc = new Scanner(System.in);
        /*
         * System.out.print("Enter number 1: ");
         * int num1 = sc.nextInt();
         * System.out.print("Enter number 2: ");
         * int num2 = sc.nextInt();
         * int sum = num1 + num2;
         * System.out.println("The Sum: " + sum);
         */
        // here what if you have to repeat this code 100 times !!
        // so there is two option 1st is copy that code by 100 times
        // and 2nd option is use the {method/funcion}.

        // simple function
        // sum(); // --> Calling the function
        // sum();
        // sum();
        // greets();
        // int ans = sum2();
        // System.out.println("I am the sum " + ans + " from returned type");
        // String msg = greet();
        // System.out.println(msg);
        // int ans = sum3(20, 30);
        // System.out.println(ans);
        // String personalized = myGreet("Aniket");
        // System.out.println(personalized);
        // System.out.print("Enter the name: ");
        // String name = sc.nextLine();
        // String personalized = myGreet(name);
        // System.out.println(personalized);

    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum: " + sum);
    }

    // return type method
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum; // function over
        // System.out.println("this will never return");
    }

    static void greets() {
        System.out.println("Jai Shri Krishna");
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}

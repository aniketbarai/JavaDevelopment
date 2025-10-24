import java.io.*;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int a[] = new int[5];
        // System.out.println("Hello Guyss");
        // try {
        // System.out.println(6 / 0);
        // System.out.println(a[8]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Tried to access element of out of bound...");
        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage());
        // }

        // try {
        // System.out.println(6 / 0);
        // System.out.println(a[8]);
        // }
        // catch (ArrayIndexOutOfBoundsException | ArithmeticException |
        // NullPointerException e) {
        // System.out.println("handling exception...");
        // }
        // catch (Exception e) {
        // System.out.println("Exception Handlin.....");
        // }
        // System.out.println("Loading...");
        // ----------------------------------------------------------------------------------------
        
        // FinallyBlockInExceptions
        // int a[] = new int[5];
        // System.out.println("Hello World");
        // try {
        // System.out.println(a[2]);
        // } catch (Exception e) {
        // System.out.println("Exception found..");
        // } finally {
        // System.out.println("I will run always..");
        // }
        // System.out.println("Radhe Radhe");
        // -----------------------------------------------------------------
        
        // JAVA throw & throws
        // try {
        // getNumFromArry(a);
        // } catch (Exception e) {
        // System.out.println("Catched the exception: " + e.getMessage());
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 0 || age > 100) {
                throw new MyException("My error is this");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }

    static int getNumFromArry(int a[]) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        return a[9];
    }
}

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

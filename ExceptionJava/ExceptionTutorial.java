/* *

 An Exception is an unexpected event that occurs during programs execution.
 It affects the flow of the program instruction which can cause the program
 to terminate abnormally. An exception can occurs for many reasons some are:
 > Invalid Users Input
 > Device failure
 > Loss of network connections
 > Code error
 > Opening an unavailable files.

 Types : 
 1. Java Runtime Exceptions
 2. Java IOExecption Exceptions
 
 >> Runtime Exception
    A runtime exception happens due to a programming error. they are also called as unchecked exception.
    The exception are not cheked at compile - time but at runtime.
    Some common type of run time exception
     > NullPointer Variable
     > OutOfBoundArray acces
     > DivideByZero 

 >> IOException
    An IOException is also known as Checked Exception.
    They are checked by the compiler at the compile time and the programmer is prompted to handle this type of exceptions
    Ex:
    > Trying to open a file that doesn't exist results in FileNotFound Exception



 */
public class ExceptionTutorial {
    public static void main(String[] args) {
        // >> try - catch block
        // The try - catch block is used to handle exceptions and prevents the abnormal
        // terminantion of the program
        try {
            int num1 = 34;
            int num2 = 0;
            System.out.println("Division is : " + (num1 / num2));
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Error");
        }
        System.out.println("Code is running further....");
        /**
         * 
         * What is exception handling ?
         * -> Exception Handling is a mechanism to handle runtime errors such as
         * ClassNotFoundException,IOException,
         * SQLException,etc
         * 
         * 
         * >>> Advantage of Exception Handling..
         * > The core advantage of exception handling is to maintain the normal flow of
         * the application.
         * 
         * 
         * The java.lang.Throwable class is the root class of exception & error
         * 
         * 
         * Java Provides five keywords that are used to handle the exceptions..
         * 1.) Try => the 'try' keyword is used to specify the block where we should
         * place an exception code.
         * the try block must be followed catch block.
         * 
         * 2.) Catch => The 'catch' block is used to handle the exception & it must be
         * preced by try block which means we can't use catch block alone.
         * 
         * 3.) Finally => The 'Finally' block is used to execute the necessary code of
         * the program whether an exception is handled or not.
         * 
         * 4.) Throw => The 'throw' keyword is used to throw an exception.
         * 
         * 5.) Throws => The throws clause is used in method signatures to indicate that
         * the method may throw certype of exception during its execution.
         * 
         */

        // try-catch-finally
        int[] arr = { 3, 4, 5, 6 };
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("GoodBye");
        }
        // Index 5 out of bounds for length 4
        // GoodBye


    }
}

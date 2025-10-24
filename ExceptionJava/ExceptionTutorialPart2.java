public class ExceptionTutorialPart2 {
    // throw example....
    public static void CheckNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative,cannot calculate square");
        } else {
            System.out.println("Square of num is: " + (num * num));
        }
    }

    // throws example....
    public static int divNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    public static void main(String[] args) {
        // ExceptionTutorialPart2 obj = new ExceptionTutorialPart2();
        // obj.CheckNum(-2);
        ExceptionTutorialPart2 obj = new ExceptionTutorialPart2();
        // System.out.println(obj.divNum(4, 0));
        System.out.println("Rest of code.......");

        /**
         * >> Custom Exceptions
         * In java,we can create our own exceptions that handle specific applcations
         * requirements.
         * Custom exceptions are derived classes of the Exception class.
         * Custom exceptions are also known as user-defined exceptions.
         */
        Bank b = new Bank();
        b.withdraw(700);
    }
}

class NegativeBalanceException extends RuntimeException {
    NegativeBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    private int balance = 500;

    public void withdraw(int amt) {
        if (amt > balance) {
            throw new NegativeBalanceException("Insufficient Balance!!");
        }
        balance -= amt;
        System.out.println("Withdraw Successful!! Remaining balance: " + balance);
    }
}

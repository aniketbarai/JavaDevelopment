import java.util.*;

//This Bank is made by Aniket Barai 
class createAccount {
    String name;
    int age;
    long balance;
    long accountNo;

    createAccount(String Name, int age) {
        this.name = Name;
        this.age = age;
        this.balance = 0;
        this.accountNo = Math.round((Math.random() * 90000) + 10000);
        System.out.println("Your account is created successfully !!");
        System.out.println("Thank you for creating your account in Ritz Bank");
        System.out.println("------------------------------------------");
    }

    void accDet() {
        System.out.println("Bank Name: Ritz Bank");
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Holder Age: " + age);
        System.out.println("Balance: " + balance);
        System.out.println("Account No: " + accountNo);
        System.out.println("------------------------------------------");

    }

    void balancez(long bal) {
        this.balance = balance + bal;
        System.out.println(bal + " Amount is credited successfully.");
        System.out.println("------------------------------------------");
    }

    void Withdrawan(long amt) {
        if (amt <= balance) {
            this.balance -= amt;
            System.out.println(amt + " Amount is Debited Succesfully.");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("Insufficent Balance!!");
            System.out.println("------------------------------------------");
        }
    }

    void balanceDet() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Current Balance " + balance);
        System.out.println("------------------------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- MENU ----------------");
        System.out.println("<<<-- Welcome to JavaBank -->>>");
        System.out.println("1.Create Account");
        System.out.println("2.ADD Balance");
        System.out.println("3.WITHDRAW Balance");
        System.out.println("4.Bank Details");
        System.out.println("5.Balance Details");
        System.out.println("6.Exit");
        System.out.println("------------------------------------------");
        createAccount acc = null;
        int Useroption;
        boolean isCreate = false;
        do {
            System.out.print("\nChoose your option: ");
            Useroption = sc.nextInt();
            System.out.println("");
            sc.nextLine();
            switch (Useroption) {
                case 1:
                    System.out.println("Creating your Account....");
                    System.out.print("Enter your Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    acc = new createAccount(name, age);
                    isCreate = true;
                    break;
                case 2:
                    if (isCreate) {
                        System.out.print("Enter Balance for Adding: ");
                        long bal = sc.nextLong();
                        acc.balancez(bal);
                    } else {
                        System.out.println("There is no account for adding money !!");
                    }
                    break;
                case 3:
                    if (isCreate) {
                        System.out.print("Enter Balance for Withdraw: ");
                        long withdr = sc.nextLong();
                        acc.Withdrawan(withdr);
                    } else {
                        System.out.println("There is no account for withdrawing money !!");
                    }
                    break;
                case 4:
                    System.out.println("Your Account Details: ");
                    if (isCreate) {
                        acc.accDet();
                    } else {
                        System.out.println("There is no account for detail !!");
                    }
                    break;
                case 5:
                    if (isCreate) {
                        acc.balanceDet();
                    } else {
                        System.out.println("There is no account for balance details !!");
                    }
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    System.out.println("Thank You for using Ritz Bank !!");
                    System.out.println("Made by Aniket Barai");
                    System.out.println("------------------------------------------\n");
                    break;
                default:
                    System.out.println("Enter Valid Option....");
                    break;
            }
        } while (Useroption != 6);
        sc.close();
    }
}
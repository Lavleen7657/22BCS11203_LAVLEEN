import java.util.Scanner;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! Current Balance: " + balance);
            } else {
                System.out.println("Error: Insufficient funds. Current Balance: " + balance);
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account account = new Account(name, accountNumber, initialBalance);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting banking system. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}

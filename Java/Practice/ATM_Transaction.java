import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String username;
    private int pin;
    private int balance;
    private List<String> transactionHistory;

    public User(String username, int pin, int initialBalance) {
        this.username = username;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void addToTransactionHistory(String transaction) {
        transactionHistory.add(transaction);
    }

    public void performWithdrawal(int amount) {
        if (balance >= amount) {
            balance -= amount;
            addToTransactionHistory("Withdrawal: " + amount);
            System.out.println("Please collect your money");
        } else {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
    }

    public void performDeposit(int amount) {
        balance += amount;
        addToTransactionHistory("Deposit: " + amount);
        System.out.println("Your Money has been successfully deposited");
        System.out.println("");
    }
}

public class ATM_Transaction {
    private static List<User> users = new ArrayList<>();
    private static User currentUser;

    public static void main(String args[]) {
        initializeUsers(); // Add some initial users

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Login");
            System.out.println("Choose 2 for Create New Account");
            System.out.println("Choose 3 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login(scanner);
                    break;

                case 2:
                    createNewAccount(scanner);
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }

    private static void initializeUsers() {
        // Add some initial users
        users.add(new User("user1", 1234, 5000));
        users.add(new User("user2", 5678, 10000));
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPin() == pin) {
                currentUser = user;
                performTransactions(scanner);
                return;
            }
        }

        System.out.println("Invalid username or PIN. Please try again.");
        System.out.println("");
    }

    private static void createNewAccount(Scanner scanner) {
        System.out.print("Enter new username: ");
        String newUsername = scanner.next();
        System.out.print("Enter new PIN: ");
        int newPin = scanner.nextInt();

        // Check if the username is already taken
        for (User user : users) {
            if (user.getUsername().equals(newUsername)) {
                System.out.println("Username already exists. Please choose a different one.");
                System.out.println("");
                return;
            }
        }

        // Create a new user account
        User newUser = new User(newUsername, newPin, 0);
        users.add(newUser);
        System.out.println("Account created successfully. You can now login.");
        System.out.println("");
    }

    private static void performTransactions(Scanner scanner) {
        while (true) {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Transaction History");
            System.out.println("Choose 5 for Logout");
            System.out.print("Choose the operation you want to perform:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    int withdrawAmount = scanner.nextInt();
                    currentUser.performWithdrawal(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");
                    int depositAmount = scanner.nextInt();
                    currentUser.performDeposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Balance : " + currentUser.getBalance());
                    System.out.println("");
                    break;

                case 4:
                    displayTransactionHistory();
                    break;

                case 5:
                    currentUser = null; // Logout
                    return;
            }
        }
    }

    private static void displayTransactionHistory() {
        System.out.println("Transaction History for " + currentUser.getUsername() + ":");
        for (String transaction : currentUser.getTransactionHistory()) {
            System.out.println(transaction);
        }
        System.out.println("");
    }
}

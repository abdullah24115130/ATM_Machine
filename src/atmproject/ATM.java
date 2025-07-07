package atmproject;

import java.util.Scanner;

public class ATM {

    private UserAccount user;
    private Scanner input;

    public ATM() {
        user = new UserAccount();
        input = new Scanner(System.in);

    }

    public void strat() {
        System.out.println("Enter your PIN: ");
        int pin = input.nextInt();
        if (user.chakpin(pin)) {
            System.out.println("Login successfull.\n");
            showMenu();
        } else {
            System.out.println("Invalid PIN.Acces denied.");
        }

    }

    private void showMenu() {
        while (true) {
            System.out.println("\n1.Chake Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw money");
            System.out.println("4.Exit");
            System.out.println("Select an option: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + user.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    user.deposit(deposit);
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if (user.withdraw(withdraw)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");

            }

        }

    }
}

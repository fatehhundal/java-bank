import java.util.InputMismatchException;
import java.util.Scanner;

public class cbs_remaster {
    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];
        String[] accountName = new String[1000];
        int option, size = 100;
        Scanner sc = new Scanner(System.in);

        while (infiniteLoop) {
            try {
                System.out.println("Welcome to Codingal Bank Services");
                System.out.println("Banking Menu:");
                System.out.println("Select any one option from below");
                System.out.println("1. Add Customer");
                System.out.println("2. Change Customer Name");
                System.out.println("3. Check Account Balance");
                System.out.println("4. Update Account Balance");
                System.out.println("5. Summary of All Accounts");
                System.out.println("6. Quit");
                System.out.print("Enter your option to proceed ahead: ");  
                option = sc.nextInt();

                if (option == 1) {
                    System.out.println("\nAdd Customer Menu");

                    sc.nextLine();

                    System.out.println("\nEnter Customer Name");
                    String name = sc.nextLine();
                    accountName[size] = name;
                    System.out.print("Enter Opening Balance Amount: ");
                    double amt = sc.nextDouble();
                    accountBalance[size] = amt;

                    System.out.println("Account created successfullly \n");
                    System.out.println("Account Details: \n");
                    System.out.println("Account Number: " + (size));
                    System.out.println("Account Name: " + accountName[size]);
                    System.out.println("Account Balance: $" + accountBalance[size] + "\n");

                    System.out.println("====================\n");
                } else if (option == 2) {
                    System.out.println("\nChange Customer Name Menu");
                    System.out.println("\nEnter Your Account Number: ");

                    int accountIndex;
                    String temp;

                    accountIndex = sc.nextInt();
                    sc.nextLine();

                    if (accountIndex > size) {
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating...\n");
                    } else {
                        temp = accountName[accountIndex];
                        System.out.print("Enter the new name: ");
                        String name = sc.nextLine();
                        accountName[accountIndex] = name;
                        System.out.println("Name is successfully updated from " + temp + " to " + name);
                    }

                    System.out.println("====================\n");
                } else if (option == 3) {
                    System.out.println("\nCheck Account Balance Menu");
                    System.out.print("\nEnter Your Account Number: ");

                    int accountIndex;

                    accountIndex = sc.nextInt();
                    sc.nextLine();

                    if (accountIndex > size) {
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating...\n");
                    } else {
                        System.out.println(accountName[accountIndex] + ", your balance is $" + accountBalance[accountIndex] + "\n");
                    }

                    System.out.println("====================\n");
                } else if (option == 4) {
                    System.out.println("\nUpdate Account Balance Menu");
                    System.out.print("\nEnter Your Account Number: ");

                    int accountIndex;

                    accountIndex = sc.nextInt();
                    sc.nextLine();

                    if (accountIndex > size) {
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating...\n");
                    } else {
                        System.out.print("Enter the amount to be deposited: ");
                        double amt = sc.nextDouble();

                        accountBalance[accountIndex] += amt;
                        System.out.println(accountName[accountIndex] + ", your updated balance is $" + accountBalance[accountIndex] + "\n");
                    }

                    System.out.println("====================\n");
                } else if (option == 5) {
                    System.out.println("Account registered\n");

                    for (int i = 100; i < size; i++) {
                        System.out.println("Account Number: " + i + ", Name: " + accountName[i] + ", Balance: $" + accountBalance[i] + "\n");
                    }

                    System.out.println("====================\n");
                } else if (option == 6) {
                    System.out.println("Terminating...");
                    System.out.println("Developed and Managed by Fateh Hundal");
                    System.out.println("Built with Java");
                    System.out.println("Perth, Western Australia");
                    infiniteLoop = false;
                } else {
                    System.out.println("\nPlease enter an option between 1 and 6\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a number.\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
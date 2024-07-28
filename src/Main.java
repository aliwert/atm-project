import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String transactionOptions = "If you want to see the balance, please press 1" +
                ", for Withdrawal press 2" +
                ", for Transfer money press 3" +
                ", for Logout press q";

        Scanner scanner = new Scanner(System.in);

        double dilanBalance = 50000;
        double alimertBalance = 40000;

        String dilanIBAN = "TR00 0000 0000 0000 0000 00";
        String alimertIBAN = "TR11 1111 1111 1111 1111 11";

        String dilanUser = "dilan";
        String alimertUser = "aliwert";

        String dilanPassword = "1234";
        String alimertPassword = "5678";

        System.out.println("Welcome to ATM");
        System.out.println("Please enter your information");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals("dilan") && password.equals("1234")) {
            System.out.println("Dilan's account was logged in");
            System.out.println(transactionOptions);
            System.out.print("Please select an option: ");
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Your Balance: " + dilanBalance);
                    break;
                case "2":
                    System.out.print("Enter Amount: ");
                    int amount = scanner.nextInt();
                    if (dilanBalance >= amount) {
                        dilanBalance -= amount;
                        System.out.println("Remaining Amount: " + dilanBalance);
                    } else {
                        System.out.println("You can't withdraw money");
                    }
                    break;
                case "3":
                    System.out.print("How much do you want to deposit? ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount <= dilanBalance) {
                        System.out.print("Enter IBAN: ");
                        scanner.nextLine(); // for bug extra nextLine
                        String depositIBAN = scanner.nextLine();
                        if (depositIBAN.equals(alimertIBAN)) {
                            System.out.println("The money was sent to " + alimertUser);
                            dilanBalance -= depositAmount;
                            alimertBalance += depositAmount;
                            System.out.println("Your balance after the deposit: " + dilanBalance);
                        } else {
                            System.out.println("Invalid IBAN");
                        }
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case "q":
                    System.out.println("Logged out");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } else if (username.equals("aliwert") && password.equals("5678")) {
            System.out.println("Ali Mert's account was logged in");
            System.out.println(transactionOptions);
            System.out.print("Please select an option: ");
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Your Balance: " + alimertBalance);
                    break;
                case "2":
                    System.out.print("Enter Amount: ");
                    int amount = scanner.nextInt();
                    if (alimertBalance >= amount) {
                        alimertBalance -= amount;
                        System.out.println("Remaining Amount: " + alimertBalance);
                    } else {
                        System.out.println("You can't withdraw money");
                    }
                    break;
                case "3":
                    System.out.print("How much do you want to deposit? ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount <= alimertBalance) {
                        System.out.print("Enter IBAN: ");
                        scanner.nextLine();
                        String depositIBAN = scanner.nextLine();
                        if (depositIBAN.equals(dilanIBAN)) {
                            System.out.println("The money was sent to " + dilanUser);
                            alimertBalance -= depositAmount;
                            dilanBalance += depositAmount;
                            System.out.println("Your balance after the deposit: " + alimertBalance);
                        } else {
                            System.out.println("Invalid IBAN");
                        }
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case "q":
                    System.out.println("Logged out");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } else {
            System.out.println("Username or Password wrong, please check it!");
        }
    }
}

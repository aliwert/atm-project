import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String transactionOptions = "If you want see the balance please press 1" +
                " for Withdrawal press 2" +
                " for Transfer money press 3" +
                " for Logout press q";

        Scanner scanner = new Scanner(System.in);



        double dilanBalance = 50000;
        double alimertBalance = 40000;

        String dilanIBAN= "TR00 0000 0000 0000 0000 00";
        String alimertIBAN = "TR11 1111 1111 1111 1111 11";

        String dilanUser = "dilan";
        String alimertUser= "aliwert";

        String dilanPassword = "1234";
        String alimertPassword="5678";

        System.out.println("Welcome to ATM");
        System.out.println("Please enter your information");

        System.out.println("Username: ");
        String username= scanner.nextLine();

        System.out.println("Enter your password: ");
        String password=scanner.nextLine();

        if(username.equals("dilan") && password.equals("1234")) {
            System.out.println("Dilan's account was logged in");
            System.out.println(transactionOptions);
            System.out.println("Please select a choose!");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Your Balance: " + dilanBalance);
                    break;
                case "2" :
                    System.out.println("Enter Amount: ");
                    int amount= scanner.nextInt();
                    if(dilanBalance>=amount) {
                        dilanBalance-=amount;
                        System.out.println("Remaining Amount: " + " "+ dilanBalance);
                    }else {
                        System.out.println("You can't withdraw money");
                    }
                    break;
                case  "3":
                    System.out.println("How much do you want to deposit?");
                    int depositAmount= scanner.nextInt();
                    if(depositAmount<=dilanBalance) {
                        System.out.println("Enter IBAN: ");
                        scanner.nextLine(); //for bug extra nextLine
                        String depositIBAN = scanner.nextLine();
                        if (depositIBAN.equals(alimertIBAN)) {
                            System.out.println("The money was sent to"+" " + alimertUser);
                            dilanBalance-=depositAmount;
                            alimertBalance+=depositAmount;

                            System.out.println("Your balance after the deposit: " + " "  + dilanBalance);
                        }
                    }
                    break;
            }
        } else if (username.equals("aliwert") && password.equals("5678")) {
            System.out.println("Ali Mert's account was logged in");
            System.out.println(transactionOptions);
        }
        else {
            System.out.println("Username or Password wrong, please check it!");
        }


    }
}
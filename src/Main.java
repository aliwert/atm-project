import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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






    }
}
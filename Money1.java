import java.util.Scanner;

public class Money1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to pay");
        int price = scanner.nextInt();
        System.out.println("Enter quantity of Product");
        int product = scanner.nextInt();
        int sum = price * product;
        if (sum > 1000) {
            System.out.println("“Not enough money!!”");
        } else {

            int money = 1000;
            int change = money - sum;
            System.out.println("Change is " + change + ("note(s)"));
            int fiveHundred = change / 500;
            change = change % 500;
            System.out.println("Five-Hundred note" + fiveHundred + ("note(s)"));
            int Hundred = change / 100;
            change = change % 100;
            System.out.println("Hundred note" + Hundred + ("note(s)"));
            int fifty = change / 50;
            change = change % 50;
            System.out.println("fifty note" + fifty + ("note(s)"));
            int Twenty = change / 20;
            change = change % 20;
            System.out.println("Twenty note" + Twenty + ("note(s)"));
            int Ten = change / 10;
            change = change % 10;
            System.out.println("Ten note" + Ten + ("note(s)"));
            int five = change / 5;
            change = change % 5;
            System.out.println("five note" + five + ("note(s)"));
            int Two = change / 2;
            change = change % 2;
            System.out.println("Two note" + Two + ("note(s)"));

            System.out.println("one note" + change + ("note(s)"));
        }
    }
}

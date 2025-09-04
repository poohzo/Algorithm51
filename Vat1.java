import java.util.Scanner;

public class Vat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Productname= ");
        String N1 = scanner.nextLine();
        System.out.print("Enter Productprice=");
        double P1 = scanner.nextDouble();
        System.out.print("Enter How many =");
        double H1 =scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Productname =");
        String N2 = scanner.nextLine();
        System.out.print("Enter Productprice=");
        double P2 = scanner.nextDouble();
        System.out.print("Enter How many =");
        double H2 =scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Productname =");
        String N3 = scanner.nextLine();
        System.out.print("Enter Productprice=");
        double P3 = scanner.nextDouble();
        System.out.print("Enter How many =");
        double H3 =scanner.nextDouble();

        System.out.print("Enter money=");
        double money = scanner.nextDouble();

        double sum = (P1*H1) +(P2*H2 )+ (P3*H3);
        double vat = sum * 0.07;
        double Net = sum + vat;
        double Change = money - Net;
        System.out.println("sum = " + sum);
        System.out.println("vat =" + vat);
        System.out.println("Net =" + Net);
        System.out.println("Change =" + Change);
    }
}
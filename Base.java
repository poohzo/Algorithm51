import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int Number = scanner.nextInt();
        if (Number == 1) {
            System.out.print("Enter base");
            int b = scanner.nextInt();
            System.out.print("Enter height");
            int h = scanner.nextInt();
            double Area = 0.5 * b * h;
            System.out.println("Arae of =" + Area);
        } else {
            if (Number == 2) {

                System.out.print("Enter weight");
                double w = scanner.nextDouble();
                System.out.print("Enter height");
                double h1 = scanner.nextDouble();
                double BMI = w / (h1 * h1);
                System.out.println("BMI = " + BMI);
            } else {
            }
        }
    }
}

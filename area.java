import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter wide");
        double wide = scanner.nextDouble();
        System.out.print("Enter long");
        double Long = scanner.nextDouble();
        double sum = (wide * Long) / 360;
        System.out.println("sum = " + sum);
    }
}
import java.util.Scanner;

public class number0 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {

            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("จบโปรแกรม");
    }
}

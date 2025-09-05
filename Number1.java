import java.util.Scanner;

public class Number1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if (number > 0) {

            System.out.println("จำนวนเต็มบวก");
        } else {
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
        }

        System.out.println("จบโปรแกรม");
    }
}

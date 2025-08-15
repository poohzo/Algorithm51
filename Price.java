import java.util.Scanner;

public class Price {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter priec of one dress");
    double price = scanner.nextDouble();
    System.out.print("Enter number od dersses to buy");
    double number = scanner.nextDouble();
    System.out.print("Enter disountAmount ");
    double discount = scanner.nextDouble();
    double cost = number * discount;
    double sum = price - cost;
    double buy = price * number - cost;
    System.out.println("ลดราคา" + cost);
    System.out.println("ราคาที่ต้องจ่าย" + buy);
  }
}
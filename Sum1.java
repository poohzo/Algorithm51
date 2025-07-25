import java.util.Scanner;
public class Sum1 {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter radisu");                                   
     int num1 = scanner.nextInt();
     System.out.print("Enter radisu");
     int num2 = scanner.nextInt();
     System.out.print("Enter radisu");
     int num3= scanner.nextInt();
     System.out.print("Enter radisu");
     int num4= scanner.nextInt();
     System.out.print("Enter radisu");
     int num5= scanner.nextInt();
     int sum=num1+num2+num3+num4+num5;
     double avg=sum/5;
  System.out.println("sum ="+sum);
  System.out.println("avg="+avg);
  }
}
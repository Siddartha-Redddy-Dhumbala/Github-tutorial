import java.util.Scanner;
public class MyException {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number: ");
      int a = sc.nextInt();
      System.out.println("Enter second number: ");
      int b = sc.nextInt();
      int c = a/b;
      System.out.println("The result is: "+c);
   }
}
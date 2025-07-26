package CSIT;
import java.util.Scanner;
public class Arithmeticoperators{
  public static void main(String[] args) {
      int a = 12, b = 5;
      Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("a + b = " + (a + b));
      System.out.println("a - b = " + (a - b));
      System.out.println("a * b = " + (a * b));
      System.out.println("a / b = " + (a / b));
      System.out.println("a % b = " + (a % b));
    }
  }
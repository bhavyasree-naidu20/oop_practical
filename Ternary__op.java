package CSIT;
import java.util.Scanner;
public class Ternary__op {
 public static void main(String[] args) {

     int februaryDays = 29;
     Scanner sc= new Scanner(System.in);
     String result;

     
     result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
     System.out.println(result);
   }
 }
import java.util.Scanner;
 
public class kalkulators {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
 //saskaitisana
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   //atnemsana
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   //reizinasanaaaa
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   //dalisana
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
 }
 
}
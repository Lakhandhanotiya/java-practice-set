/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
*/
import java.util.Scanner;//import scanner class
class Question01{

public static void main(String []args){

Scanner num = new Scanner(System.in);//create a scanner object

System.out.print("enter first number =");
int Num1 = num.nextInt();

System.out.print("enter Secound number =");
int Num2 = num.nextInt();


System.out.println(Num1 + " + " + Num2 + " = " + Num1 + Num2);
System.out.println(Num1 + " - " + Num2 + " = " + (Num1-Num2));
System.out.println(Num1 + " X " + Num2 + " = " + Num1 * Num2);
System.out.println(Num1 + " / " + Num2 + " = " + Num1 / Num2);
System.out.println(Num1 + " % " + Num2 + " = " + Num1 % Num2);

}
}
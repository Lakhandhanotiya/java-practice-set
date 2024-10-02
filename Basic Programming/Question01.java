/*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
*/
import java.util.Scanner;//import scanner class
class Question01{

public static void main(String []args){

Scanner num = new Scanner(System.in);//create a scanner object

System.out.print("enter first number =");
int Num1 = num.nextInt();

System.out.print("enter Secound number =");
int Num2 = num.nextInt();


System.out.println(Num1 + " x " + Num2 + " = " + Num1 * Num2);
}
}
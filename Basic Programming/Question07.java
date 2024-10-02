/*7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
*/
import java.util.Scanner;//import scanner class
class Question01{

public static void main(String []args){

Scanner num = new Scanner(System.in);//create a scanner object

System.out.print("enter  number =");
int Num = num.nextInt();
for(int i=1; i<=10; i++){


System.out.println(Num + " X " + i + " = " + i*Num);
}
}
}
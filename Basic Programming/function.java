//import java.io.PrintStream;
import java.util.Scanner;

public class function{

public static void main(String[] a)
{
 

Scanner F = new Scanner(System.in);
System.out.println("enter nnumber");
int num = F.nextInt();
findOddEven(num);
sqare(num);
}




public static void findOddEven(int num)
{
if(num%2==0)
System.out.println("this number is even = "  + num);

else

System.out.println("this number is Odd = " + num);

}


public static void sqare(int num)
{

System.out.println("Sqare of number " +   num*num);

}


}
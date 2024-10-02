import java.util.Scanner;
class SwapVariable{
	
public static void main(String []args){
	

double num1,num2,num3;

Scanner s=new Scanner (System.in);
System.out.println("enter a b ");
num1=s.nextDouble();

num2=s.nextDouble();
//Scanner in=new Scanner (System.in);
num3=0;
num3=num1;
num1=num2;
num2=num3;



System.out.println("swap value a = " + num1 );


System.out.println("swap value a = " + num2 );
}


}
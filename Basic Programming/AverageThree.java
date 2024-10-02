import java.util.Scanner;
class ThreeNumber{
	
public static void main(String []args){
	

double num1,num2,num3;

Scanner av=new Scanner (System.in);
System.out.println("enter three number ");
num1=av.nextDouble();

num2=av.nextDouble();
//Scanner in=new Scanner (System.in);
num3=av.nextDouble();

System.out.println("Average of three number = " + (num1+num2+num3)/3);


}

}

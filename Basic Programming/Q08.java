/*08 Write a Java program to display the following pattern.
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 
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
import java.util.Scanner;
public class fibonacci{

public static void main(String[] args) {
    


    System.out.println("enter a number");
    int i,num,sum=0;

    Scanner F = new Scanner(System.in);

   num = F.nextInt();

   for(i=0; i<=num; i++)
   {

    sum=sum+i;
    System.out.println(sum );
   }
   System.out.println(sum);



   
}




}
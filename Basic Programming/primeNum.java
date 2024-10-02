import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        System.out.println("Enter number");
         Scanner P1 = new Scanner(System.in);
         int num = P1.nextInt();

         if(num%2==0)
         {
            System.out.println("Number is Prime" + num);

         }
         else
         {
            System.out.println("Number is not Prime" + num);
         }

    }
}


package balcosit21a2;
import java.util.Scanner;

public class BalcosIT21A2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         
         System.out.println("Input the 1st number: ");
         int a = input.nextInt();
         System.out.println("Input the 2nd number: ");
         int b = input.nextInt();
         System.out.println("Input the 3rd number: ");
         int c = input.nextInt();
         
         int greatest = a;
         if(b > greatest) greatest = b;
              if(c > greatest) greatest = c;
              
              System.out.println("The Greatest number is: " + greatest);
    }
    
}

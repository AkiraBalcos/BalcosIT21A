
package PRELIM;
import java.util.Arrays;
import java.util.Scanner;

public class methodsActivity {
     static void message(String name , int age){
        System.out.println("Hello Guys, this is " + name + ". I am " + age + " years old!");
    }
    
    static int calculateAge(int currentYear, int birthyear){
        return currentYear - birthyear;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            
            System.out.println("Enter your age; ");
            int age = sc.nextInt();
          
        if (age == 18){
            System.out.println("Honest");
        } else {
             System.out.println("Liar");
        }
 
            message(name, age);
            
             System.out.println("My real age is " + calculateAge(2026, 2006));
           //  int calculateAge = calculateAge(2026, 2006);
          
         //  public static void main (String[] args);
           String[] Children = {"Chen", "March", "Hudson", "Carl", "Ryan"};
            System.out.println("Children of Marchilyn " + Arrays.toString(Children));
    }
   
}

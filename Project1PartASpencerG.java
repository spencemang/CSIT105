
package project1spencerg;
import java.util.Scanner;

/**
 *
 * @author spencer Granger
 */
public class Project1PartASpencerG {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      
        String cookieType;
        int cookiesinBag;
        int totalServings;
        int servingCals;
        int cookiesEaten;
        double cookiesperServing;
        double servingsEaten;
        double totalCals;
        double calsperCookie;
        
        System.out.print("Which cookies did you eat?");
        cookieType=input.nextLine();
        
        System.out.print("How many cookies are there in a bag?");
        cookiesinBag=input.nextInt();
        
        System.out.print("\nHow many servings are there in a bag?");
        totalServings=input.nextInt();
        
        System.out.print("\nHow many calories are in a serving?");
        servingCals=input.nextInt();
        
        System.out.print("\n How many cookies did you eat?");
        cookiesEaten=input.nextInt();
        
         cookiesperServing=(double)cookiesinBag/totalServings;
         eatenCals= cookiesperServing





         
         
        

         
        
        
       
        
        
        
      
    }
    
}


package project1spencerg;
import java.util.Scanner;

/**
 *
 * @author Spencer Granger
 */
public class Project1PartASpencerG {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      
        String cookieType;
        int cookiesinBag;
        int totalServings;
        int servingCals;
        int cookiesEaten;
        double eatenCals;
        double cookiesPerServing;
        double calsPerCookie;
        
        System.out.print("Which cookies did you eat? ");
        cookieType=input.nextLine();
        
        System.out.print("How many cookies are there in a bag? ");
        cookiesinBag=input.nextInt();
        
        System.out.print("How many servings are there in a bag? ");
        totalServings=input.nextInt();
        
        System.out.print("How many calories are in a serving? ");
        servingCals=input.nextInt();
        
        System.out.print("\n How many cookies did you eat? ");
        cookiesEaten=input.nextInt();
        
         cookiesPerServing=(double)cookiesinBag/totalServings;
        
         calsPerCookie=servingCals/cookiesPerServing;
         
         eatenCals=calsPerCookie*cookiesEaten;
         
         System.out.printf( "\n%d %s cookies is %.1f calories\n", cookiesEaten, cookieType, eatenCals);




         
         
        

         
        
        
       
        
        
        
      
    }
    
}

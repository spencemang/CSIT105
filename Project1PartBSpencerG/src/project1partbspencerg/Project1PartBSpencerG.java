
package project1partbspencerg;
import java.util.Scanner;

/**
 *
 * @author Spencer Granger
 */
public class Project1PartBSpencerG {


    public static void main(String[] args) {



        final int COOKIES_PRODUCED=48;
        final double CUPS_OF_SUGAR=1.5/COOKIES_PRODUCED;
        final double CUPS_OF_BUTTER=1/COOKIES_PRODUCED; 
        final double CUPS_OF_FLOUR=2.75/COOKIES_PRODUCED;

        Scanner input = new Scanner(System.in);
       
        int neededCookies;

        System.out.print("Enter the number of cookies you want to make: ");
        neededCookies = input.nextInt();

        System.out.print("\nTo make " + neededCookies + " cookies using this recipe, you will need:");
        System.out.printf("\nSugar \t %.2f Cups", neededCookies * CUPS_OF_SUGAR);
        System.out.printf("\nButter \t %.2f Cups", neededCookies * CUPS_OF_BUTTER);
        System.out.printf("\nFlour \t %.2f Cups", neededCookies * CUPS_OF_FLOUR); 



        
        
    
        
        
        
        
        
      
    }
    
}

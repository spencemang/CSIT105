
package lab2cspencerg;
import java.util.Scanner;

/**
 *
 * @author Spencer Granger
 */
public class Lab2CSpencerG {
    
    public static void main(String[] args) {
          
     Scanner input = new Scanner(System.in);
     
     int launchedBunnies;
     int points;
    double pointsPerBunny;
     
        System.out.println("How many bunnies did you launch? ");
        
        launchedBunnies=input.nextInt();
       
        System.out.println("How many points did you earn? ");
        
        points=input.nextInt();
        
        pointsPerBunny=(double)points/launchedBunnies;
        
        System.out.print(points + " Points for " + launchedBunnies + " bunnies " + "= ");
        System.out.printf("%.2f ",  pointsPerBunny);
        System.out.println("points per bunny");
        System.out.println("Press any key to continue . . .");
        
        
        
        
        
    }
    
}

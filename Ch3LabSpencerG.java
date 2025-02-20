

package ch3labspencerg;


        /**
Programmed by Linda Yang
Date Written: 2/2/2015
*/

import java.util.Scanner;

public class Ch3LabSpencerG
{
    
    public static void main(String[] args)
          {
// declare variables
                Scanner input = new Scanner(System.in);
                int caloriesEntered;
                String descriptionEntered;

                Food myFood; // declares myFood as a Food
                // get data
                System.out.print("Enter the description of the food: ");
                descriptionEntered = input.nextLine();
                System.out.print("Enter the calories per serving for the food: ");
                caloriesEntered = input.nextInt();
                // instantiate object
                myFood = new Food(descriptionEntered,caloriesEntered);

                myFood.setDescription(descriptionEntered);
                myFood.setCalories(caloriesEntered);

                // display results
                System.out.println("\nDescription: " + myFood.getDescription());
                System.out.println("Calories per serving: " + myFood.getCalories());
            }
}

     
    
    


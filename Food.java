
package ch3labspencerg;

/**
 *
 * @author Spencer Granger
 */



public class Food {
    private String description;
    private int calories;
    
    
    /**
     * 
     * Constructor for the food class
     * 
     * @param newDescription- The new description of the food item
     * @param newCalories - The new amount of calories to set the food item 
     */
           Food(String newDescription, int newCalories)
           {
                      newDescription=description;
                      newCalories=calories;
           }
    
    /**
     * returns the description of the food item
     * @return 
     *  the description of the food item
     * 
     */
           public String getDescription()
          {
                      return description;
        
           }
    
     /**
      * returns the number of calories in the food item
     * @return 
      *  the calories in the food item
      */
           public  int getCalories()
          {
                      return calories;
          }
    
    /**
     * sets the private description value of the class as newDescription
     * @param newDescription 
     * the new description of the food item
     */
           public  void setDescription(String newDescription)
            {
                     description=newDescription;
        
             }
    
    /**
     * sets the private calories variable as newCalories
     * @param newCalories
     * The new calories of the food item
     */
           public void setCalories(int newCalories)
           {
                      calories=newCalories;
             }
}

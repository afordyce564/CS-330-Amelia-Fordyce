import java.util.Random;

/**
 *  The Die class simulates a six-sided die.
 */

public class Die
{
   int sides;   // Number of sides
   private int value;   // The die's value
   //int value;
   
   /**
    *  The constructor performs an initial
    *  roll of the die. The number of sides
    *  for the die is passed as an argument.
    */
   
   public Die(int numSides)
   {
      sides = numSides;
      roll();
   }

   /**
    * toString() can be used to print out the die
    */

    public String toString(){
      return("face up: " + this.value);
    }
   
    /**
     * compareTo() compares the value of two dice
     * returns 0 if the same, 
     * <0 if this die<other die, 
     * >0 if this die < other die
     */

     public int compareTo(Die other){
         return(this.value-other.value);
     }

   /**
    *  The roll method simlates the rolling of
    *  the die.
    */
   
   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1;
   }
   
   /**
    *  The getSides method returns the 
    *  number of sides for the die.
    */
   
   public int getSides()
   {
      return sides;
   }
   
   /**
    *  The getValue method returns the
    *  value of the die.
    */
   
   public int getValue()
   {
      return value;
   }
}
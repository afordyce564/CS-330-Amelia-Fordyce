import java.util.Random;
import java.util.Scanner;

/**
 * This program tests the Die object
 */

public class TestDriver
{
   public static void main(String[] args)
   {
      // Named constants
      final int NUM_SIDES = 6;      // Number of sides for the dice

      // Create a 6 sided Die objects to test.
      Die die1 = new Die(NUM_SIDES);
      System.out.println(die1);
      // roll the die three more times to check if roll works
      for(int i = 0;i<3;i++){
            // Roll the dice for the computer.
            die1.roll();
            System.out.println(die1);  
            //System.out.println(die1.value);
            System.out.println(die1.sides);
            System.out.println(die1.getValue());

      //System.out.println(die1);
      } // for
   }// main
}//class
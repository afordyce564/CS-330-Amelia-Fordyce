//main program that rolls two dice and compares to find a winner
public class find_a_winner {
    //create two dice objects
    public static void main(String [] args){
        // Named constants
        final int NUM_SIDES = 6;      // Number of sides for the dice
        
        Die die1 = new Die(NUM_SIDES);
        Die die2 = new Die(NUM_SIDES);

        
        //System.out.println(die1);
        //System.out.println(die2);

        //roll the dice for a fair fight
        die1.roll();
        System.out.println(die1);
        die2.roll();
        System.out.println(die2);

        //compare the two, we want the higher one to win
        if (die1.compareTo(die2) > 0){
            System.out.println("\nDie 1 is the winner!");
        }
        if (die2.compareTo(die1) > 0){
            System.out.println("\nDie 2 is the winner!");
        }
    }
    
}

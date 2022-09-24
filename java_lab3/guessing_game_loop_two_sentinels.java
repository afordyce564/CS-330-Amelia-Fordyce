import java.util.Scanner;
public class guessing_game_loop_two_sentinels {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String keepGoing = "y"; //program will not start unless this is set to y
        int guess_number = 7; // edit so it fits a number you want
        
        System.out.println("Enter a number from 1-10: ");
        int guess = sc.nextInt();
        //sentinel will be the keep going variable
        //actually it will be the number 
        //use a while loop
        while (guess != guess_number && keepGoing.equals("y")){

            //if guess is wrong
            //ask player if they want to play again
            //if n let them go
            // if y let them play again
            //how do I get it to return to the while loop condition with an if statement
            if (guess != guess_number){
                System.out.println("\nIncorrect!");
                //keepgoing question only after an incorrect question
                System.out.println("Do you want to keep going? ");
                keepGoing = sc.next();
                //if yes, while loop will run again
                //if no, program will exit
                if(keepGoing.equals("n")){
                    System.out.println("\nBye!");
                }
                else{
                    System.out.println("\nEnter a number: ");
                    guess = sc.nextInt();
                }
            }
            }

            //if guess is correct
            //end the program
            if(guess == guess_number){
                System.out.println("\nCorrect!");
                System.out.println("Bye!");
            }
            
            
            sc.close();

        }
    }



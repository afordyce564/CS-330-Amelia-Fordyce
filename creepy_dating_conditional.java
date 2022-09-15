import java.util.Scanner;
/* program goal

-  program that provides guidance 
   on whether your specific client should date a specific other person. 
- youngestLimit = clientAge /2 + 7
- oldestLimit = (clientage -7) *2

*/

public class creepy_dating_conditional{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //input
        //get client age, partner age, get partner gender, get partner name
        System.out.println("Enter your age: ");
        int clientAge = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nEnter date's age: ");
        int dateAge = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nEnter date's gender: ");
        String dateGender = sc.nextLine();

        System.out.println("\nEnter date's name: ");
        String dateName = sc.nextLine();

        //Calculate youngestLimit
        int youngestLimit = clientAge/2+ 7;

        //Calculate oldestLimit
        int oldestLimit = (clientAge - 7)* 2;
 
        //use cases
        // dateAge < youngestLimit
        if(dateAge < youngestLimit){
            System.out.println("\nFind someone a bit older!");
        }
        
        //dateAge > oldestLimit
        if(dateAge > oldestLimit){
            System.out.println("\nFind someone a bit younger!");
        }
        
        //I had a problem with this if condition
        //I thought the string comparison would be similar to Python
        //it was not
        //dategender == boy  and datename !=David
        if (dateName.equals("David") && dateGender.equals("male")){
            System.out.println("\nEw David!");

        }
    sc.close();
       
    } 
}
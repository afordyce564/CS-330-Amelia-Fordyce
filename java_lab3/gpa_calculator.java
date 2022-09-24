/*client wants to know GPA for last semester
 * They took three courses and have grades as letters
 */

import java.util.Scanner;
public class gpa_calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //first write code without loop
        //one grade only
        //struggled with figuring out how to go back to while loop
        //when finished running the while loop for the first round
        String keepGoing = "y";
        double total = 0; //records how many grades entered
        //write a while loop 
        //
        while(keepGoing.equals("y")){
            System.out.println("Enter a letter grade: ");
            String letter_grade = sc.next();
            //total variable needs to add the double to it
            switch(letter_grade) {
                case "A": 
                    double num = 4.0;
                    total = total + num;
                    System.out.println(num);
                    break;
                case "B": 
                    num = 3.0;
                    total = total + num;
                    System.out.println(num);
                    break;
                case "C": 
                    num = 2.0;
                    total = total + num;
                    System.out.println(num);
                    break;
                case "D": 
                    num = 1.0;
                    total = total + num;
                    System.out.println(num);
                    break;
                case "E": 
                    num = 0.0;
                    total = total + num;
                    System.out.println(num);
                    break;    
        }

        System.out.println("\nDo you want to enter another grade? ");
        keepGoing = sc.next();
        //System.out.println("Enter a letter grade: ");
        //letter_grade = sc.next();
        //it does not like an if/else condition
        //calculate average
    }
    double average = total/3; //divided by how many grades user entered
    System.out.println("Average: "+Double.valueOf(average));
    //do we need a sentinel for keeping track of the # of grades entered?
    sc.close();
    }
}

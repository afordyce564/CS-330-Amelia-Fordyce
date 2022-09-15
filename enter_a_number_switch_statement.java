import java.util.Scanner;

public class enter_a_number_switch_statement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        //switch case here we go!!!
        //I'm having an issue with the switch case because I can't say number ==2 and number == 8
        //The cases are that statement 
        //oh my god
        //I'm not too familiar with these, so I won't optimize it
        //also without break statements everything prints out no matter what number is entered

        //Sources
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

        switch (number){
            case 2: case 8:  //if ((number == 2) || (number == 8))
                    System.out.println("You think too binary!");
                    break;

            //you can't have duplicate cases, that's why you can only have case 4 in one location. 
            
            case 4: case 9: //if ((number == 4) || (number == 9)); 
                    System.out.println("You are a square!");
                    break;
                
            case 1: number = 1;
                System.out.println("You are a loner!");
                break;
            
            case 3: case 7: //if ((number == 3) || (number == 7))
                    System.out.println("You are great!");
                    break;
            
            default:
                System.out.println("You should reconsider your options and try again next week");
                break;
            
        }
        sc.close();
    }
}


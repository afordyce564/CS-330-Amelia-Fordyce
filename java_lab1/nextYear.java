import java.util.Scanner;
/*
 * ask client for their birth year
 * calculate how old I will be next year
 * display message "Next year I will turn " (put age in the blank)
 */
class nextYear{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your birth year");
        int birthYear  = sc.nextInt();

        //easy to figure out what next year will be
        //You can subtract your birthyear from 2023 to find out how old you would be in the next year
        int nextAge = 2023 - birthYear;

        System.out.println("You will turn "+nextAge+ " next year");
        
    sc.close();
     //I understand everything!
    }
}

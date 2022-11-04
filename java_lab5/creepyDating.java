import java.util.*;
public class creepyDating {
    public static void main(String [] argv) throws Exception{
        introduction(argv);
        float clientAge = getClientAge();
        float oldestDateAge = getOldestDateable(clientAge);
        float youngestDateAge = getYoungestDateable(clientAge);
        float dateAge = getDateAge();
        report(clientAge, dateAge, youngestDateAge, oldestDateAge);
    }
    public static void introduction(String [] args){
        System.out.println("Welcome to the Creepy Dating Progra!. You can find out if you can date people you're interested in. The older and younger limits of your dating pool will be calculated.");
    }

    public static float getClientAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age? ");
        float clientAge = sc.nextFloat();
        return clientAge;
    }
    public static float getOldestDateable(float clientAge){
       float oldestDateAge = 2 * (clientAge-7);
       return oldestDateAge;
    }
    public static float getYoungestDateable(float clientAge){
        float youngestDateAge = (clientAge/2)+7;
        return youngestDateAge;
     }
    public static float getDateAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your date's age? ");
        float dateAge = sc.nextFloat();
        return dateAge;
    }
    public static void report(float clientAge, float dateAge, float youngestDateAge, float oldestDateAge){
        //report upper and lower limits
        System.out.println("\nYour age is "+clientAge+ " years old.");
        System.out.println("Your date's age is "+dateAge+ " years old.");
        System.out.println("Your upper limit is "+ oldestDateAge+ " years old.");
        System.out.println("Your lower limit is "+ youngestDateAge+ " years old.");

        //dateAge < youngestDateAge
        if (dateAge < youngestDateAge){
            System.out.println("\nYour date is too young!");
        }
        //dateAge > oldestDateAge
        else if(dateAge > oldestDateAge){
            System.out.println("\nYour date is too old!");
        }
        //dateAge < oldestDateAge and dateAge > youngestDateAge
        else if (dateAge < oldestDateAge  && dateAge > youngestDateAge ){
            System.out.println("\nYour date is within the age range.");
        }

    }
}


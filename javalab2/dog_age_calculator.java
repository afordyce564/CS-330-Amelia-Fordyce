import java.util.Scanner;
/* Create a program that’s dog’s equivalent age calculator, 
given the dog’s weight and age in calendar years.
Think about what’s the input 
(what do you need from your dog-owning client?), 
what’s the if/else conditions to apply the right formula 
and what’s the output (print statement for the client) 
 */


public class dog_age_calculator {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        //inputs
        System.out.println("What is the dog's weight?");
        int weight = sc.nextInt();
        sc.nextLine();

        System.out.println("What is the dog's age in calendar years?");
        int age = sc.nextInt();
        sc.nextLine();

    
        //use cases
        //had trouble thinking about how I would test all these cases
        //will try to use a switch statement if possible but it only takes one argument
        // use age for each use case?????

        // weight < 20 lbs and age in calendar years = 1
        // age is 15 (can I use nested if statements???)
        int age_dog_years = 0;
        
        if(age == 1){
            if (weight < 20){
                age_dog_years = 15;
                //System.out.println(age_dog_years);
            }
            if (weight > 20 && weight < 50){
                age_dog_years = 15;
            }
            if (weight > 50 && weight < 90){
                age_dog_years = 15;
            }
            if (weight > 90){
                age_dog_years = 15;
            }
        }
        if(age == 2){
            if (weight < 20){
                age_dog_years = 21;
                //System.out.println(age_dog_years);
            }
            if (weight > 20 && weight < 50){
                age_dog_years = 21;
            }
            if (weight > 50 && weight < 90){
                age_dog_years = 21;
                //System.out.println(age_dog_years);
            }
            if (weight > 90){
                age_dog_years = 21;
            }
        }

        // weight < 50 and weight > 20 lbs and age in calendar years = 1
        // age is 15
        //if(weight < 50 && weight > 20 && age == 1){}

        // weight < 90 and weight > 50 lbs and age in calendar years = 1
        // age is 15
        //if(weight < 20 && age == 1){}

        // weight > 90 lbs and age in calendar years = 1
        // age is 15
        //if(weight < 20 && age == 1){}

        // weight < 20 lbs and age in calendar years = 2
        // age is 15
        //if(weight < 20 && age == 1){}

        // weight < 50 and  >20 lbs and age in calendar years = 2
        // age is 21
        //if(weight < 20 && age == 1){}

        // weight < 90 and  >50 lbs and age in calendar years = 2
        // age is 21
        //if(weight < 20 && age == 1){}

        // weight > 90 lbs and age in calendar years = 2
        // age is 21
        //if(weight < 20 && age == 1){}

        //each additional year
        //what's the calculation????
        //I used this example from the lab 2 doc and it works!
        //adds additional year to 2 years old
        else{
            age_dog_years = 21 + (age - 2) * 5;
            System.out.println(age_dog_years);
        }
        
        System.out.println("\nYour dog's age in dog years is "+age_dog_years);

    sc.close();

    }
}

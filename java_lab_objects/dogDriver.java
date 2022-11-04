//main program that rolls two dice and compares to find a winner
/*sources 
- https://www.w3schools.com/java/java_class_attributes.asp
- https://stackoverflow.com/questions/29642108/java-printing-an-array-of-objects
- https://stackoverflow.com/questions/18159104/java-error-the-constructor-is-undefined
*/

public class dogDriver {
    //create two dice objects
    public static void main(String [] args){
        
        Dog [] dogs = new Dog [5];
        
        dogs[0] = new Dog("Munch", 1, 15,10, "puppy");
        dogs[1] = new Dog("Mimi", 5, 36, 76, "older than a puppy");
        dogs[2] = new Dog("Madness", 8, 51, 20, "older than a puppy");
        dogs[3] = new Dog("Marcus", 3, 26 , 15, "kind of a puppy");
        dogs[4] = new Dog("Marmalade", 12, 71, 22, "old dog");

        //set all dog attributes inside the driver
        //first dog1
        /* 
        dog1.name = "Munch";
        dog1.cal_age = 1;
        dog1.human_age = 15;
        dog1.weight =  10;
        dog1.designation = "puppy";

        //then dog2
        dog2.name = "Mimi";
        dog2.cal_age = 5;
        dog2.human_age = 36;
        dog2.weight =  76;
        dog2.designation = "older than a puppy";


        System.out.println(dog1);
       
        //compare the two, we want the higher one to win
        
        if (dog1.compareTo(dog2) > 0){
            System.out.println("\nDog 1 is the winner!");
        }
        if (dog2.compareTo(dog1) > 0){
            System.out.println("\nDog 2 is the winner!");
        }
        */

        //add each dog to an array, then loop through to print out names
        //this would be good if we had two dogs, but Nanette wants only one object
         
        //trying to get values from constructors above but idk how to return them
        System.out.println("\n");
        for(int i = 0; i < dogs.length ; i++){
            System.out.println(dogs[i].getName());

        
    }
    
    
}
}

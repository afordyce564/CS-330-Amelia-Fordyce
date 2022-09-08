import java.util.ArrayList; //import ArrayList class

public class arrayListIntegers{
    /*
     * We talked a little bit in class about ArrayLists in Java
     * Write a program that creates an ArrayList of Integers 
     * (notice the capital I Integer, not int – you can’t put primitive types in ArrayLists)
     * and uses the following functions 
     * (you may want to refer to the documentation here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html):
     * add, remove, set, size, isEmpty()
     * If any of these functions return something, 
     * make sure to use that information. For example, 
     * if the isEmpty() function returns False, 
     * print something like “Is this list empty? False” 
     * (you don’t have to use if/else statements here – we’ll learn about those next week. 
     * Just use print statements)
     * 
     * 
     * I used this https://www.w3schools.com/java/java_arraylist.asp
     */
    public static void main (String [] args){
        //Honestly initializing the ArrayList was the hardest part 
        //This reminds me of Data Structures 
        ArrayList<Integer> numbers = new ArrayList<Integer>(); //create array list object
        numbers.add(0);
        numbers.add(2);
        numbers.add(3);

        numbers.remove(2);

        numbers.set(0, 1);

        numbers.size();
        
        numbers.isEmpty();

        //nothing is being returned 

        System.out.println("The size of the list is "+numbers.size());
        System.out.println("Is the list empty? "+numbers.isEmpty());
        
        //Is the main difference between arrays and ArrayLists that ArrayLists don't take primitive data types?
        //I'm not sure I understand everything about ArrayLists
        //They are similar to Python objects because you can use similar methods to interact with Python Object attributes
        
    }
}
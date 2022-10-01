import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

//Write a program that can transform legal (simple) java statements into S (Answer2.java) 

public class Answer2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //String more = "y";
   
        System.out.println("Enter a simple (legal) Java statement: ");
        String inputString = sc.nextLine(); 

            //patterns to match a simple Java stament like arithmetic
            //the only thing it matches right now is that
        String statementPattern  = "([a-z]*[0-9]*\s?[=+_/*]{1}\s?[0-9]*[a-z]*\s?[=+_/*]{1}\s?[0-9]*[a-z]*)";

            //find matches  ... this particular code is FYI only and you can remove it if you use this file to build on
        boolean testS = Pattern.matches(statementPattern, inputString);   

            // or, instead, replace matched parts
        String fixedInput = inputString.replaceAll(statementPattern,"S");
        System.out.println("fixed: " + fixedInput);

        System.out.println("------------------------\n\nstatement");
        System.out.println(testS);  

            //System.out.println("more to parse? [y/n]");
            //more = sc.next(); 
        sc.close();
    }

}


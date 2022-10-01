import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

//Write a replacement regex to replace all whitespace in an input string.
//need input from using
//if whitespace detected, replace with $

public class whitespace_match {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        String whiteSpacePattern  = "\s";
        

            //find matches  ... this particular code is FYI only and you can remove it if you use this file to build on
        boolean testWhiteSpace = Pattern.matches(whiteSpacePattern, inputString);   

            // or, instead, replace matched parts
        
        String fixedInput = inputString.replaceAll(whiteSpacePattern,"Stop"); //this works correctly
        System.out.println("fixed: " + fixedInput);

        System.out.println("------------------------\n\nvariable operator number");
        System.out.println(testWhiteSpace);  
        sc.close();
    }
}  
    


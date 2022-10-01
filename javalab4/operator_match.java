import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

/*
Write a regex that matches Operators and replaces them with a common symbol (like OP) 
Once you test it in a separate java program, add it and your whitespace code (from (1)) 
to the existing replacement code in RegexExample4.java (rename Answer1.java) 
to be able to transform strings like x=y + 32; 
🡪  ID=IDOPX; 

variable = ID
operator = OP
number = X
*/

public class operator_match {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //String more = "y";
   
        System.out.println("Enter an expression: ");
        String inputString = sc.nextLine(); 

            //patterns to match variable and operations and numbers
        String variablePattern  = "[a-z][A-Z]?";
        String operationPattern = "([+-/%*])";
        String numPattern = "([0-9]{1,})";

            //find matches  ... this particular code is FYI only and you can remove it if you use this file to build on
        boolean testID = Pattern.matches(variablePattern, inputString);   
        boolean testOP = Pattern.matches(operationPattern, inputString);   
        boolean testX = Pattern.matches(numPattern, inputString);

            // or, instead, replace matched parts
        
        String fixedInput = inputString.replaceAll(variablePattern,"ID"); //this works correctly
        //System.out.println("fixed: " + fixedInput);
        fixedInput = fixedInput.replaceAll(numPattern,"X");
        //System.out.println("fixed: " + fixedInput);
        fixedInput = fixedInput.replaceAll(operationPattern,"OP");
        System.out.println("fixed: " + fixedInput);

        System.out.println("------------------------\n\nvariable operator number");
        System.out.println(testID+"   "+testOP+"   "+testX);  

            //System.out.println("more to parse? [y/n]");
            //more = sc.next(); 
        sc.close();
    }
    }


import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//import java.util.regex.Matcher;
import java.util.regex.Pattern;  
/*
Sources
https://www.digitalocean.com/community/tutorials/java-read-file-to-string


 * Lexer only for class that only contains main method
 * Read in entire program into single string to parse (not line by line)
 * Program conforms to Java language rules (pattern matching)
 * class defintion, main method definition
 * don't need to handle object or array declarations, only primitives
 * reserved words: int, float, String, char, boolean
 * arithmetic statements (no parentheses or concatenate strings yet)
 * Simple output System.out.println("String") | System.out.println(aNumberVariable)
 */

public class driver{
    public static void main(String [] args) throws Exception{
        //read in a file

        try{
            File fileObj = new File("testA.java");
            Scanner fileIn = new Scanner(fileObj);
            String wholeProgram = ""; 
         
            while (fileIn.hasNext()){
               wholeProgram = wholeProgram+fileIn.nextLine();
            }
            System.out.println(wholeProgram);
            fileIn.close();
             //match class and main method declarations
    //why don't my patterns match even though they match in pythex???
    //the class_dec won't match anything :(
            String class_dec_pattern = "(\s?public class{1}\s?[a-z]*[A-Z]*\s?[a-z]*[A-Z]*[-_]*\s?[a-z]*[A-Z]*[-_]*\s?[a-z]*[A-Z]*[-_]*)";
            String main_method_dec_pattern = "(\s?public static void main[(]{1}String\s{0,}arg[a-z]?\\S?\\s?\\S?[)])";
            String statementPattern  = "(\s?[a-z]*[0-9]*\s?[=+_/*]{1}\s?[0-9]*[a-z]*\s?[=+_/*]{1}\s?[0-9]*[a-z]*)";
          
            boolean test_class_dec = Pattern.matches(class_dec_pattern, wholeProgram);
            boolean test_svm_dec = Pattern.matches(main_method_dec_pattern, wholeProgram);
            boolean test_statement = Pattern.matches(statementPattern, wholeProgram);

            System.out.println("------------------------\n\nClass Declaration");
            System.out.println(test_class_dec);

            System.out.println("------------------------\n\nMain Method");
            System.out.println(test_svm_dec);

            System.out.println("------------------------\n\nArithmetic Statement");
            System.out.println(test_statement);

         } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
         }
        //System.out.println(wholeProgram);

        }
            
    }

//import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.regex.Pattern;  
public class small_regex_test {
   public static void main(String argv[ ]) throws Exception{
   
      File fileObj = new File("testA.java");
      Scanner fileIn = new Scanner(fileObj);
      String wholeProgram = ""; 
            
      while (fileIn.hasNext()){
         wholeProgram = wholeProgram+fileIn.nextLine();
      }
      System.out.println(wholeProgram);
      String whiteSpacePattern  = ".+\s.+";
          
  
      //find matches  ... this particular code is FYI only and you can remove it if you use this file to build on
      boolean testWhiteSpace = Pattern.matches(whiteSpacePattern, wholeProgram);   
      System.out.println(testWhiteSpace);
      // or, instead, replace matched parts
  
      String fixedInput = wholeProgram.replaceAll(whiteSpacePattern,"Stop"); //this works correctly
      System.out.println("fixed: " + fixedInput);

      System.out.println("------------------------\n\nWhitespace");
      //System.out.println(testWhiteSpace);  
      fileIn.close();

          
      }
  }  
      
  
  
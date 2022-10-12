//import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class ReadFileInBetter{

   public static void main(String argv[ ]) throws Exception{
   
      try{
         File fileObj = new File("testA.java");
         Scanner fileIn = new Scanner(fileObj);
         String wholeProgram = ""; 
      
         while (fileIn.hasNext()){
            wholeProgram = wholeProgram+fileIn.nextLine();
         }
         System.out.println(wholeProgram);
         fileIn.close();
      //try
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
      
   } // main
   
}
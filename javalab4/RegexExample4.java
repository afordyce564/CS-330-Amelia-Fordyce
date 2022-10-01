import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class RegexExample4{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        String more = "y";
        do{
            System.out.println("Enter an identifier or number");
            String inputString = sc.nextLine(); 

            String numPattern = "\\b\\d+\\b" ;                // \d means "digit". Make sure that's all there is to the word using \b
            String idPattern = "\\b[a-z]\\w*\\b";             // \w means word character (includes digits and _)
            //find matches  ... this particular code is FYI only and you can remove it if you use this file to build on
            boolean testNum = Pattern.matches(numPattern, inputString);   
            boolean testID = Pattern.matches(idPattern, inputString);   

            // or, instead, replace matched parts
            String fixedInput = inputString.replaceAll(numPattern,"X");
            System.out.println("fixed: " + fixedInput);
            fixedInput = fixedInput.replaceAll(idPattern,"ID");
            System.out.println("fixed: " + fixedInput);

            System.out.println("------------------------\n\nnumber identifier");
            System.out.println(testNum+" "+testID);  

            System.out.println("more to parse? [y/n]");
            more = sc.next(); 
        }while(more.equals("y"));
        sc.close();
    }
}  
import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class RegexExample3b{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        String more = "y";
        do{
            System.out.println("Enter an identifier or number");
            String inputString = sc.next(); 

            String numPattern = "\\d+" ;                // \d means "digit". sadly, one \ means escape char like in \n
            String idPattern = "[a-z]\\w*";             // \w means word character (includes digits and _)
            //3rd way  
            boolean testNum = Pattern.matches(numPattern, inputString);   
            boolean testID = Pattern.matches(idPattern, inputString);   

            System.out.println("number identifier");
            System.out.println(testNum+" "+testID);  

            System.out.println("more to parse? [y/n]");
            more = sc.next(); 
        }while(more.equals("y"));
        sc.close();
    }
}  
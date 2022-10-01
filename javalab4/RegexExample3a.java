import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class RegexExample3a{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        String more = "y";
        do{
            System.out.println("Enter an identifier or number");
            String inputString = sc.next(); 

            String numPattern = "[0-9]+" ;
            String idPattern = "[a-z][a-zA-Z_0-9]*";       
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
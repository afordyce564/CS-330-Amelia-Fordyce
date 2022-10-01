import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class if_else_match {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a code block: ");
        String inputString = sc.nextLine(); 

        //if statement with statement inside?
        String if_else_pattern = "([a-z]*\s?[(]?\s?[a-z]*[0-9]*\s?[<>!=&|]\s?[0-9]*[)]*\s[{]*\s?[0-9]*[a-z]*[+-=]*[0-9]*[a-z]*[;]?\s?[}]*)";

        boolean test_if_else = Pattern.matches(if_else_pattern, inputString);

        //String fixedInput = inputString.replaceAll(code_block_pattern,"S");
        //System.out.println("fixed: " + fixedInput);

        System.out.println("------------------------\n\nif/else");
        System.out.println(test_if_else);  

        
        sc.close();


    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class Answer3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a code block: ");
        String inputString = sc.nextLine(); 

        //parse each statement
        //statement is from last exercise - for arithmetic 
        String statementPattern  = "([a-z]*[0-9]*\s?[=+_/*]{1}\s?[0-9]*[a-z]*\s?[=+_/*]{1}\s?[0-9]*[a-z]*)";
        //String if_else_pattern = "([a-z]*\s?[(]?\s?[a-z]*[0-9]*\s?[!=&|]*\s?[0-9]*[a-z]*\s?[)]?\s?[{}]*)";
        //String while_pattern = "";

        boolean test_statement = Pattern.matches(statementPattern, inputString);
        //boolean test_if_else = Pattern.matches(if_else_pattern, inputString);

        //String fixedInput = inputString.replaceAll(code_block_pattern,"S");
        //System.out.println("fixed: " + fixedInput);

        System.out.println("------------------------\n\narithmetic statement  if/else");
        System.out.println(test_statement);  

        
        sc.close();


    }
}

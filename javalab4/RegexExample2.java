import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class RegexExample2{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);

        System.out.println("What string do you want to check?");
        String inputString = sc.next(); 

        System.out.println("What regex pattern do you want to match?");
        String regexPattern = sc.next();

       //1st way  
        Pattern p = Pattern.compile(regexPattern);//. represents single character  
        Matcher m = p.matcher(inputString);   //Matcher m = p.matcher("as");  
        boolean b = m.matches();  
        
        //2nd way  
        boolean b2=Pattern.compile(regexPattern).matcher(inputString).matches();  
        
        //3rd way  
        boolean b3 = Pattern.matches(regexPattern, inputString);   
        
        System.out.println("This regex matches" + regexPattern);
        System.out.println(b+" "+b2+" "+b3);  
    sc.close();
    }
}  
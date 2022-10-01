import java.util.regex.Matcher;
import java.util.regex.Pattern;  
import java.util.Scanner; 

public class RegexExample1{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);

        System.out.println("What string do you want to check?");
        String inputString = sc.next(); 
       //1st way  
        Pattern p = Pattern.compile(".s");//. represents single character followed by an s
        Matcher m = p.matcher(inputString);   //Matcher m = p.matcher("as");  
        boolean b = m.matches();  
        
        //2nd way  
        boolean b2=Pattern.compile(".s").matcher(inputString).matches();  
        
        //3rd way  
        boolean b3 = Pattern.matches(".s", inputString);   
        
        System.out.println("This regex matches all strings with 2 characters and the last one is an /s/");
        System.out.println(b+" "+b2+" "+b3);  
        sc.close();
  
    }
}  
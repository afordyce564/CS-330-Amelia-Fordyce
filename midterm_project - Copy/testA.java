//import java.util.*;
import java.util.Scanner;

public class testA{
   
   public static void main(String argv[ ]) throws Exception{
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter today's temperature in farenheit");  
      double today = sc.nextDouble();
   
      for(int i=1;i<4;i++){       
         System.out.println("Enter the temperature in farenheit for "+i + " days ago");  
         double earlierDay = sc.nextDouble();
         if(today- earlierDay > 0){
            System.out.println("It was colder than today");}
         else{
            System.out.println("it was hotter than today");
         } 
      }
      double celsius= f2c(today);
      System.out.println(today + " F ="+celsius + " C");  
      sc.close();
      	      	
   }
   
   public static double  f2c(double f){
      double c = 5.0 /9 * (f - 32); 
      return(c);
   }// f2c
}

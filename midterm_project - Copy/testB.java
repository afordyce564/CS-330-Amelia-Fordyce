//import java.util.*;

class BLevel{
   
   public static void main(String argv[ ]) throws Exception{    
      double celsius = 16.0;
      while (celsius < 28){
         double faren = celsius * 9.0/5 + 32.0;   
         System.out.println("The temperature in farenheit is ");
         System.out.println(faren);                   
         if(faren > 65.0 && faren < 78.0){
            System.out.println("It's comfortable");
         }
         else{
            System.out.println("It's not comfortable");
         }
         celsius = celsius + 2.0; 
      }
   }
}


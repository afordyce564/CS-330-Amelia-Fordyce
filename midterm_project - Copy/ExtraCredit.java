import java.util.*;

class ExtraCredit{
   public static void main(String argv[]){
      Scanner sc = new Scanner (System.in);
      
      System.out.println("What is the temp in Farenheit?");
      double ftemp = sc.nextDouble(); 
      Temperature t1 = new Temperature(ftemp);
     
      System.out.println("that's " + t1.getKelvin() + " K"); 

      sc.close();
   
   }
}
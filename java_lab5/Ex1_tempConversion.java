import java.util.*;

class Ex1_tempConversion{
  
   public static void main(String argv[ ]) throws Exception{   
      double farenheit = getTemp();   
      double celsius= f2c(farenheit);
      report(farenheit, celsius);    	      	
   }

   public static void report(double f, double c){ //removed static 
      System.out.println(f + "F = "+celsius + " C");    
    }
      
    public static double getTemp(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter today's temperature in farenheit");  
        double temp = sc.nextDouble();
        return(temp);
   }
   
    static double  f2c(double f){ //removed public
      double c = 5.0 /9 * (f - 32); 
      //int c = 5.0/9 * (f-32);
      //String c = 5.0/9 * (f-32);
      return(c);
   }// f2c
}

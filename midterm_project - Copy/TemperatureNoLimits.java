import java.util.*; 
class TemperatureNoLimits{

   // attribute
   private double farenheit;
    
   TemperatureNoLimits(){
      farenheit = 32.0;
   }
         
   TemperatureNoLimits(double f){
      farenheit = f;
    } 

   public String toString (){
      return("Temperature: " + farenheit +"F, " + getCelsius() +"C, " + getKelvin() + "K");
   }
  
   private double calc_f2c(double f){
   // this is a private function that uses f to calc celsius
      double celsius = (f-32.0)*5.0/9;
      return(celsius); 
   }
   
   private double calc_f2k(double f){
      // this is a private function that uses f to calc kelvin
      double kelvin =  calc_f2c(f)+273.0;
      return(kelvin); 
   }
   
   double getFarenheit(){
      return(farenheit);}
   
   double getCelsius(){
      double c = calc_f2c(farenheit); 
      return (c);}
   
   double getKelvin(){
      double k = calc_f2k(farenheit);
      return(k ); } 


}// Temperature class


/**************** cheating and putting in same file *******************/
/** remember to get the import java util line if you break this into 2 files */ 


class TempTestDriver{
   public static void main(String argv[]){
      Scanner key = new Scanner (System.in);
      
      System.out.println("What is the temp in Farenheit?");
      double ftemp = key.nextDouble(); 
      TemperatureNoLimits t1 = new TemperatureNoLimits(ftemp);
     
      System.out.println("that's " + t1.getKelvin() + " K"); 
   key.close();
   }
}
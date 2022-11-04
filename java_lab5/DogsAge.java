import java.util.*; 

class DogsAge{
    
    public static void main(String [] argv){
    //prompt for dogs name and age
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your dog's name? ");
        String dogName = sc.next();
        System.out.println("How old is your dog? ");
        double calendarYears = sc.nextDouble();
        double hEqY = 0.0; 
// calculations (not needed here)

//Case I one year old dogs
        if (calendarYears <= 1){
            hEqY = 15;}

//Case II two year old dogs
        else if(calendarYears <= 2){
            hEqY = 21;}
    
//Case III older dogs
        else{
            System.out.println("How much does your dog weigh? ");
            int dogWt = sc.nextInt();
            int ageFactor = 1; 
            //Case IIIa small dogs (<=20 lbs)
            if(dogWt<= 20){
                ageFactor =4;}
            //Case IIIb normal dogs (20<wt<=50 lbs)
            else if(dogWt<= 50){
                ageFactor =5;}
            //Case IIIc big dogs (50<wt<=90 lbs)
            else if(dogWt<= 90){
                ageFactor =6 ;   }   
            //Case IIId very big dogs (>90 lbs)
            else{
                ageFactor = 7;
                hEqY = 21 + (calendarYears - 2)*ageFactor;
            } 
        }

// report
        System.out.println(dogName +  " is " + hEqY + " years old equivalent to a human");
    }
}
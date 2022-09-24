
public class fizzbuzz {
    public static void main(String [] args){
        int i = 1;
        while(i < 101){
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            //else{
              //  System.out.println(i);
           // }
            
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
           
            //when this was an or instead of and it prints the message instead
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //else prints all numbers
            else{
                System.out.println(i);
            }
        i += 1;
        }
    }
}

public class chars_and_strings {
        /*
         * Do some research on Java chars, char arrays, and Strings 
         *  write some code that shows the differences between an array of chars and a String
         * Make sure to cite your sources in your comments
         * Hint: check the java documentation (“Java 11 String”) to learn about what the String class can do
         */
    
        //Sources
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
        //https://www.w3schools.com/java/java_strings.asp
        //https://www.edureka.co/blog/character-array-in-java/#LoopsInCharArray
        //https://www.javatpoint.com/character-array-in-java
    
        public static void main(String [] args){
          //This is a string
          //you can assign a string value to a String variable
          //do not have to convert anything
          String str1 = "hello";

          //This is an array of chars
          //each char has to be an item in the array
          //it also has to be in order it can resemble the word the user wants
          //Then you have to create a new String that is a conversion of the char into a String
          char str_data[] = {'h','e','l','l','o'};
          String str2 = new String(str_data);

          //you can convert a string into a char array too
          char[] str1_array = str1.toCharArray(); // Conversion to character from string  
          for(char c : str1_array) //Iterating array values  
         {  
          System.out.println(c);   //prints out each character 
        }  

          //Here's a substring of str1
          String llo = str1.substring(2,5);
          System.out.println(llo);  
          //to make a substring, you have to create substrings by starting and ending at certain characters
        
          //Here's a substring of str2
          //You can make substrings out of char arrays
          str2.getChars(0,3,str_data,0);
          //have to make a for loop to print each char in char array
          for(char res: str_data){
            System.out.println(res);
          }

          // length method is very similar for both Strings and char arrays
          System.out.println(str1.length());
          System.out.println(str_data.length);


        //test outputs
          //System.out.println(str1); 
          //System.out.println(str2);
          //System.out.println(llo);  
        

          //I understand everything!
        }
    }
    



## This folder contains all questions from Java Lab 4


### whitespace_match.java
  #### How I wrote this program
      1. Copy/Pasted the code from the last demo 
      2. Changed the regular expression to match all whitespace 
      3. Adjusted existing code so it would check whether or not whitespace is present
      4. Changed the character that would replace the whitespace
      
  #### Comments
      - Not hard
      - I understood how to do this
      - Took out the while loop
        
### operator_match.java
   #### How I wrote this program
      1. Copy/Pasted code from whitespace_match.java
      2. Adjusted regular expression to capture all arithmetic operators (+,-,*,/,%), variables, and numbers
      3. Adjusted the existing code to check whether or not these things are matched 
   
   #### Comments
      - Program kept adding extra replacement characters where they didn't belong
      - Decided to take it step by step and figure out how match each operator, variable, and number correctly
  
        
### Answer2.java
 #### How I wrote this program
     1. Began similarly to other programs I wrote for this lab
     2. My regular expression was incorrect at first, so I used pythex to help me match all kinds of simple arithmetic statements
     
 #### Comments
       - This one was a little more dificult
       - Not sure how to take statements, put them inside if statement/while loop/for loop/switch statement, etc, and match them correctly
  
  
### Answer3.java
 #### How I wrote this program
      1. Copy-pasted code from answer2.java
      2. Wrote what kind of statements/loops would be in a code block on paper
      3. Attempted to write regex that would match if/else statements and while loops
      
 #### Comments
      - Still figuring out how to match a while loop/if statement with a statement inside of it
      - Trying to work it out on paper
 
### if_else_match.java
  #### How I wrote this program
    1. Copy-pasted code from another one of my programs
    2. Wrote a pattern to match if/else statements for Answer3.java
    3. Realized I could use it in this program
    4. Wrote separate patterns for very simple if and else statements
  
  #### Comments
    - I don't know how complicated this and codeblock program should be
    - Should the regex be for very simple statements?
  
 
## Sources
- included within each file's comments
      

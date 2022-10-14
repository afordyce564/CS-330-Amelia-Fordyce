## Data Types

### 1. What are the boolean values in your language? (e.g., True and False, true and false, 1, and 0, etc.) 

  	The boolean values in Go are true and false. The zero-value for a boolean is false. The one-value for a boolean is true. 
	.  


### 2. What types of conditional statements are available in your language?  (if/else, if/then/else, if/elseif/else).  Does your language allow for statements other than “if” (for example, Perl has an “unless” statement, which does the opposite of “if”!)

  	if, else if, and else are available in Go. You can write an if statement with a short declaration statement. The variable declared in the short statement in the if statement and it's else if/else statements. If you write an if/else if/else chain, you cannot write the else if on a new line. It will give you an error that it found else. 



### 3. How does your language delimit code blocks under each condition in selection control statements?
    	Go delimits code blocks under if/else if conditions with a tab. It delimits code blocks under switch statements with a tab and the "case" keyword. 
      

### 4. Does your language use short-circuit evaluation?  Include an example of the short-circuit logic working or not working (or both, if your language is like Java and supports both!)
  
  	Go uses short-circuit evaluation. The Go language specification states "Logical operators apply to boolean values and yield a result of the same type as the operands. The right operand is evaluated conditionally."

	

### 5. How does your programming language deal with the “dangling else” problem?
  	You can't put else on a separate line. When you write a dangling else on purpose, this error will appear "expected statement, found 'else'"


### 6. If your language supports switch or case statements, do you have to use “break” to get out of them?  Can you use “continue” to have all of the conditions evaluated? 
  
  	Go supports switch statements and does not require the "break" keyword to get out of each case. It seems like you can use continue as a keyword but it does not have overall effect on the rest of the switch statement. 
	

### Sources
  - https://www.callicoder.com/golang-control-flow/
  - https://kuree.gitbooks.io/the-go-programming-language-report/content/22/text.html
  - https://go.dev/ref/spec#Logical_operators
  - https://www.digitalocean.com/community/tutorials/how-to-write-switch-statements-in-go

 


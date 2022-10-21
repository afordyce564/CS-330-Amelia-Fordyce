# PLP folder for Amelia Fordyce

## PLP 0 

### Tutorial

  1. Install the latest Go compiler from the official Go website 
  2. Install the Go extension in Visual Studio Code
  3. make sure you create main.go by writing package main at the top of the program, this ensures that the main function will run
  4. Import fmt module for printing to the console by writing import fmt
  5. Write the main function like this func main(){}
  6. Inside the main function, write your print statement like this: fmt.Println("Hello World!")

## PLP 1

### History

1. What is the name of your language?
  	The name of my language is Golang, or Go, for short. 
    
2. When/where was it created, and by whom? Was it written to address a particular problem or
need?
    Go was created in 2007 by Google. It was developed by Robert Griesemer, Rob Pike, and Ken Thompson. It was written to address its own problems in relation to multicore processors, networked systems and large codebases. Go was also designed to simplify the development of multithreaded applications and encourage concurrent programming. The language is based on C++, Java, and Python

3. What types of programming is your language primarily used for (ex: web sites, video games,
mobile devices, parsing, etc.)? If your language is multi-purpose, provide some examples of
different projects it's been used for.

Go can be used for server-side apps with support for multiple threads, cross-platform CLI tools, and other systems programming. 


4. Where will you get information about this language when it's time to start programming in it?
At the end of your assignment, provide a list of the names of books, website URLs, or any
other resources that relate to your language in particular.

I will get information about Go from its documentation, the W3 schools tutorial, and the tutorialspoint tutorial

Resources
- https://go.dev/doc/
- https://www.w3schools.com/go/index.php 
- https://www.tutorialspoint.com/go/index.htm

### Get Started

1. What did you need to do to install the language?

  The installation of Go was pretty easy. First I downloaded the compiler from the Go website. (https://go.dev/dl/). I chose the latest build.

2. Does this language come with a recommended programming environment? What is it? If not,
how did you pick the one that you'll be using?
  
  The most recommended programming environment for Go is Visual Studio Code. There is an extension for Go developed by Google. 

3. How do you run programs in that language?
  
   To run programs in Go, you need to write a main function that looks like this:
   
   func main(){
	  fmt.Println("Hello World!")
  }
   
   fmt is a popular module for Go that is for output
   You can run Go programs in Visual Studio Code. 
  
4. How do you write comments in your language?

  Writing comments in Go is similar to Java because you denote comments with //
  
## PLP 3 Data Types

### 1. Does your language have keywords or reserved words? How many?  

	Go has reserved words. There are 25 reserved words.  


### 2. What are the naming requirements for variables in your language?  
What about naming conventions? Are those enforced by the compiler/interpreter, or just  standards in the community? 

	Variable names cannot start with a digit, but they can begin with a letter or an underscore. Variable names can include digits 1-10, letter a-z and A-Z. 	Names of variables are case sensitive. They cannot include reserved words. 
	
	You must declare variables with the var keyword. 


### 3. Is your language statically or dynamically typed? 
	
	Go variables are statically typed, which means that they have the type given to them by the declaration. They 

### 4. Strongly typed or weakly typed? 

	Go is strongly typed, which means that each type of data is predefined as part of the programming language. 

### 5. Explicitly typed or implicitly typed? 

	The language is implicitly typed because types are not required to be part of a variable’s declaration. 


### 6. Are some variables mutable while others are immutable? 
	Strings are the only variable type in this language that are immutable. 


### 7. What are the operators available for each data type?  




	binary_op  = "||" | "&&" | rel_op | add_op | mul_op .
	rel_op     = "==" | "!=" | "<" | "<=" | ">" | ">=" .
	add_op     = "+" | "-" | "|" | "^" .
	mul_op     = "*" | "/" | "%" | "<<" | ">>" | "&" | "&^" .

	unary_op   = "+" | "-" | "!" | "^" | "*" | "&" | "<-" .
	

### 8. Are mixed type operations allowed? If so, how are they accommodated? 


	Mixed type operations do not seem to be allowed.  


### 9. At what point are identifier names and operator symbols bound in your language? For example  if you declare a (variable, class name, function name), when is it bound to the type, address?  When are operators (+,*, etc.) bound to their operations?  

### Identifier names and operator symbols are bound in Go when variables, classes, and functions are declared. You declare variables with the var keyword and the type is automatically bound. 
### CODING EXAMPLE demonstrating the features above 
### 1 Adapted with permission from Dr. Amber Stubbs
### EXAMPLE OF (one) ILLUSTRATIVE EXAMPLE:  
### If you put this line (or something similar) in a program and try to print x, what does it do?  x = "5" + 6 

	
	You cannot compile that statement. You will get this error. 

	(mismatched types untyped string and untyped int)


### If it doesn't compile, why? Is there something you can do to make it compile? 

	The above statement does not compile because the types are unmatched and the integer is untyped. 

	You can print the addition of 5 and 6 in a print statement. Inside the statement they are considered to be integers. 


### 10. Describe the limitations (or lack thereof) of your programming language as they relate to the  coding example portion of the assignment (adding ints and floats, storing different types in lists,  converting between data types). Are there other restrictions or pitfalls that the documentation  mentions that you need to be aware of? 
	
	Go is statically typed, which means that it will be less flexible than other languages. Converting strings to integers is more difficult than in other languages. You will have to import the strconv package and use the Atoi() function. For converting integers to strings, you have to use the Itoa() function. 


### 11. Are there built-in complex data types that are commonly used in your language? (hint: they’d  probably appear fairly early in the documentation if so) 

        Complex data types in Go are integers and floating point numbers.
	
## Selection and Conditional Statements

### 1. What are the boolean values in your language? (e.g., True and False, true and false, 1, and 0, etc.) 

  	The boolean values in Go are true and false. The zero-value for a boolean is false. The one-value for a boolean is true. 
	.  


### 2. What types of conditional statements are available in your language?  (if/else, if/then/else, if/elseif/else).  Does your language allow for statements other than “if” (for example, Perl has an “unless” statement, which does the opposite of “if”!)

  	if, else if, and else are available in Go. You can write an if statement with a short declaration statement. 
	The variable declared in the short statement in the if statement and it's else if/else statements. 
	If you write an if/else if/else chain, you cannot write the else if on a new line. It will give you an error that it found else. 



### 3. How does your language delimit code blocks under each condition in selection control statements?
    	Go delimits code blocks under if/else if conditions with a tab. 
	It delimits code blocks under switch statements with a tab and the "case" keyword. 
      

### 4. Does your language use short-circuit evaluation?  Include an example of the short-circuit logic working or not working (or both, if your language is like Java and supports both!)
  
  	Go uses short-circuit evaluation. The Go language specification states "Logical operators apply to boolean values and yield a result of the same type as the operands. The right operand is evaluated conditionally."

	

### 5. How does your programming language deal with the “dangling else” problem?
  	You can't put else on a separate line. When you write a dangling else on purpose, this error will appear "expected statement, found 'else'"


### 6. If your language supports switch or case statements, do you have to use “break” to get out of them?  Can you use “continue” to have all of the conditions evaluated? 
  
  	Go supports switch statements and does not require the "break" keyword to get out of each case. 
	It seems like you can use continue as a keyword but it does not have overall effect on the rest of the switch statement. 
	

## Sources
  - https://www.callicoder.com/golang-control-flow/
  - https://kuree.gitbooks.io/the-go-programming-language-report/content/22/text.html
  - https://go.dev/ref/spec#Logical_operators
  - https://www.digitalocean.com/community/tutorials/how-to-write-switch-statements-in-go
  - https://kuree.gitbooks.io/the-go-programming-language-report/content/16/text.html
  - https://devopedia.org/go-language
  - https://www.digitalocean.com/community/tutorials/how-to-write-comments-in-go
  - https://ado.xyz/blog/converting-strings-to-numbers-in-go/
  - https://go.dev/ref/spec
  - https://datafloq.com/read/go-language-benefits-limitations/
  - https://www.geeksforgeeks.org/go-variables/?ref=lbp
  - https://www.digitalocean.com/community/tutorials/how-to-do-math-in-go-with-operators



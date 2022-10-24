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

## PLP 4 Loops and Functions

### 1. Does your language include multiple types of loops (while, do/while, for, foreach)?  If so, what are they and how do they differ from each other?
    Go includes the for loop only. It "unfies" for and while. There is no do/while or foreach loop in Go. You can attempt to write a while loop by writing a for loop with a boolean condition. You can try to write a do-while loop as well using a for loop. 
    
    ```
    //while loop in go?
    var i = 1
	for i < 5 {
		fmt.Println("not 5")
		i++

	}
	```
	
   ```
   //do-while in go?
   	//do-while loop?
	for {
		main()
		if !true {
			break
		}
	}
   ```
    
### 2. What is the syntax for declaring a function in your language?
    This is the syntax
    
    func functionName (parameters) {}
    
### 3. Are there any rules about where the function has to be placed in your code file so that it can run?
      Functions that are referenced in the main function have to be written above it. 
    
### 4. Does your language support recursive functions?
    Go does support recursive functions. The base case has to be written before the main call. The recursive function needs to be called in the main function. 
    
### 5. Can functions in your language accept multiple parameters?  Can they be of different data types?
    Functions in Go can accept multiple parameters with different data types. 
    
### 6. Can functions in your language return multiple values at the same time?  How is that implemented?  If not, are there ways around that problem?  What are they?
    Go functions can return multiple values at the same time. You can return multiple values with one reutrn statement. 
    
### 7. Is your language pass-by reference or value?  Check your code against outside sources in case there is anything tricky going on (like in Perl).
	Go is pass-by reference and pass-by value. There is code in the source list that has good examples of how both run in Go. 
	
### 8. Where are the arguments, parameters and local variables stored (value-on-stack, ref-to-heap-on stack) during execution?
	Arguments, parameters, and local variables are stored value on stack during execution. 
	
### 9. What are the scoping rules in your language (visibility and lifetime of variables before, during and after code blocks)? Are loop code block variables treated differently than function code blocks?
	`package main

	import "fmt"

	func main() {
		var f bool = false

		//local variable, can only be used in function
		var t bool = true

		fmt.Println(t)

		//Question 2: example of conditional statements
		if t != true {
			fmt.Println("weird")
		} else if f != false {
			fmt.Println("also weird")
		} else {
			fmt.Println("everything is okay!")
		}
	//will work
	fmt.println(t)
	
	
	//will run even when it's not in a function
	flavors := []string{"chocolate", "vanilla", "strawberry", "banana"}
	for _, flav := range flavors {
		switch flav {
		case "strawberry":
			fmt.Println(flav, "is my favorite!")
			continue
		case "vanilla", "chocolate":
			fmt.Println(flav, "is great!")
		default:
			fmt.Println("I've never tried", flav, "before")
		}
	}
`
### 10. Are side-effects possible? Are there guard rails against side-effects?
	Side effects are possible in Go. It doesn't seem like there are guard rails. 
	
### 11. Where are local Are there any other aspects of functions in your language that aren't specifically asked about here, but that are important to know in order to write one?  What are they? (e.g. dynamic vs static scope)
	Go is lexically scoped using blocks. It has a static scope. 
	
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
  - https://david-yappeter.medium.com/golang-pass-by-value-vs-pass-by-reference-e48aac8b2716
  - https://kuree.gitbooks.io/the-go-programming-language-report/content/24/text.html
  - https://kodify.net/go/while-loop/#code-a-go-while-loop-with-for
  - https://www.ardanlabs.com/blog/2013/09/recursion-and-tail-calls-in-go_26.html
  - https://stackoverflow.com/questions/28541609/looking-for-reasonable-stack-implementation-in-golang
  - https://www.reddit.com/r/golang/comments/f7i3cz/why_does_programming_with_side_effects_seem_to_be/



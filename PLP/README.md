# PLP folder for Amelia Fordyce

## For code examples see folders for each section!

## PLP 0 

### Tutorial

  1. Install the latest Go compiler from the official Go website 
  2. Install the Go extension in Visual Studio Code
  3. make sure you create main.go by writing package main at the top of the program, this ensures that the main function will run
  4. Import fmt module for printing to the console by writing import fmt
  5. Write the main function like this func main(){}
  6. Inside the main function, write your print statement like this: fmt.Println("Hello World!")
  7. Run your program
  	In Go, you cannot run your program without writing a command in the terminal
	
  	- You'll need to open the terminal. You can do that in VS code by going to the terminal tab in menu in the top left of the screen
	- Click New Terminal
	- When the new terminal is ready, make sure that it is in the directory you are working in. 
	- Make sure Go is correctly installed. You can check this by typing go help. If the go keyword is yellow, that means it's been installed correctly
	- Type go run program_name.go

## PLP 1

### History

  1. What is the name of your language?
  	
	The name of this language is Golang, or Go, for short. 

  2. When/where was it created, and by whom? Was it written to address a particular problem or
	need?
	
	Go was created in 2007 by Google. It was developed by Robert Griesemer, Rob Pike, and Ken Thompson. It was written to address its own problems in relation to multicore processors, networked systems and large codebases. Go was also designed to simplify the development of multithreaded applications and encourage concurrent programming. The language is based on C++, Java, and Python

3. What types of programming is your language primarily used for (ex: web sites, video games, mobile devices, parsing, etc.)? If your language is multi-purpose, provide some examples of different projects it's been used for.

	Go can be used for server-side apps with support for multiple threads, cross-platform CLI tools, and other systems programming. 


4. Where will you get information about this language when it's time to start programming in it? At the end of your assignment, provide a list of the names of books, website URLs, or any other resources that relate to your language in particular.

	I will get information about Go from its documentation, the W3 schools tutorial, and the tutorialspoint tutorial


### Get Started

1. What did you need to do to install the language?
	
	The installation of Go was pretty easy. First I downloaded the compiler from the Go website. (https://go.dev/dl/). I chose the latest build.

2. Does this language come with a recommended programming environment? What is it? If not, how did you pick the one that you'll be using?

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
  
## PLP 2 Data Types

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

	The language is implicitly typed because types are not required to be part of a variable???s declaration. 


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

	 Identifier names and operator symbols are bound in Go when variables, classes, and functions are declared. You declare variables with the var keyword and the type is automatically bound. 
	 
### If you put this line (or something similar) in a program and try to print x, what does it do?  x = "5" + 6 

	
	You cannot compile that x = "5"+ 6. You will get this error. 

	(mismatched types untyped string and untyped int)


	### If it doesn't compile, why? Is there something you can do to make it compile? 

	The above statement does not compile because the types are unmatched and the integer is untyped. 

	You can print the addition of 5 and 6 in a print statement. Inside the statement they are considered to be integers. 


### 10. Describe the limitations (or lack thereof) of your programming language as they relate to the  coding example portion of the assignment (adding ints and floats, storing different types in lists,  converting between data types). Are there other restrictions or pitfalls that the documentation  mentions that you need to be aware of? 
	
	Go is statically typed, which means that it will be less flexible than other languages. Converting strings to integers is more difficult than in other languages. You will have to import the strconv package and use the Atoi() function. For converting integers to strings, you have to use the Itoa() function. 


### 11. Are there built-in complex data types that are commonly used in your language? (hint: they???d  probably appear fairly early in the documentation if so) 

        Complex data types in Go are integers and floating point numbers.
	
## PLP 3 Selection and Conditional Statements

### 1. What are the boolean values in your language? (e.g., True and False, true and false, 1, and 0, etc.) 

  	The boolean values in Go are true and false. The zero-value for a boolean is false. The one-value for a boolean is true. 
	


### 2. What types of conditional statements are available in your language?  (if/else, if/then/else, if/elseif/else).  Does your language allow for statements other than ???if??? (for example, Perl has an ???unless??? statement, which does the opposite of ???if???!)

  	if, else if, and else are available in Go. You can write an if statement with a short declaration statement. 
	The variable declared in the short statement in the if statement and it's else if/else statements. 
	If you write an if/else if/else chain, you cannot write the else if on a new line. It will give you an error that it found else. 

### 3. How does your language delimit code blocks under each condition in selection control statements?
    	Go delimits code blocks under if/else if conditions with a tab. 
	It delimits code blocks under switch statements with a tab and the "case" keyword. 
      

### 4. Does your language use short-circuit evaluation?  Include an example of the short-circuit logic working or not working (or both, if your language is like Java and supports both!)
  
  	Go uses short-circuit evaluation. The Go language specification states "Logical operators apply to boolean values and yield a result of the same type as the operands. The right operand is evaluated conditionally."

	

### 5. How does your programming language deal with the ???dangling else??? problem?
  	You can't put else on a separate line. When you write a dangling else on purpose, this error will appear "expected statement, found 'else'"


### 6. If your language supports switch or case statements, do you have to use ???break??? to get out of them?  Can you use ???continue??? to have all of the conditions evaluated? 
  
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
	
### 11. Where arelocal Are there any other aspects of functions in your language that aren't specifically asked about here, but that are important to know in order to write one?  What are they? (e.g. dynamic vs static scope)
	Go is lexically scoped using blocks. It has a static scope. 

## PLP 5 Objects

### 1. Does your language support objects or something similar (e.g., structs or records)? Are there naming conventions for objects, instance variables, or functions that people writing in your language should be aware of?
	
	Go supports structs instead of objects, but they function similarly to objects. They have attributes and methods just like an object would. 
	As seen with variable declarations in Go, you need to write the variable name as variableName type instead of the other way round. Structs do not use a special struct keyword, they are declared using the type keyword followed by the className and the keyword struct. 
		

### 2. Does your language have standard methods for functions that serve a similar purpose across all objects? For example, toString() in Java and __str__ in Python 		allow information about the objects to be printed. Are there similar functions in your language?
	
	It is possible to create a normal toString() function in Go. You can also create the parent and child objects first. Write functions for each struct to print their attributes. I only wrote one attribute for each struct. In the main function create a child struct where the attributes of parent and child structs can be accessed. It is possible to write print statements that call the the separate print functions. 
    	
### 3. How does inheritance work (if it does)? Does your language support multiple inheritance?
	It is possible to inherit parent classes in Go. You can define both parent and child structs in the same program. After that, you need to define a child struct that inherits the structs you wrote before this one. In the main function, you declare an instance of a child object and declare its values within the context of a parent struct. Go supports multiple inheritance.

### 4. If there is inheritance, how does your language deal with overloading method names and resolving those calls?
	 The child object can access the parent's methods by creating a child struct that has parent classes for attributes. Go does not have overloaded functions. It only does function overloading with optional parameters. You can simulate this with a variadic function, which accepts a variable number of parameters. With this overloading, you lose type checking.

### 5. Is there anything else that???s important to know about objects and inheritance in your language? If your language doesn't support anything like this, then explain why not and what it does instead, or how people work around not having those things.

	You can create an anomynous struct in Go, which means that it will only create a struct variable and not a new struct type. You can also create nested structs, which are structs with attributes with the struct type. 
	
### Code 
```
	/*
 * Goal: Build a really good choose your own adventure game
 * One step at a time
*/

// Golang program to illustrate the
// concept of multiple inheritances
package main

import (
	"fmt"
)

// declaring first
// base struct
type person struct {

	// declaring struct variable
	name string
}

// declaring second
// base struct
type member struct {

	// declaring struct variable
	club string
}

// function to return
// first struct variable
func (p person) printPerson() string {

	// returns a string
	// of first struct
	return p.name
}

// function to return
// second struct variable
func (m member) printMember() string {

	// returns a string
	// of first struct
	return m.club
}

// child struct which
// embeds both base structs
type child struct {

	// anonymous fields,
	// struct embedding
	// of multiple structs
	person
	member
}

// main function
func main() {

	// declaring an instance
	// of child struct
	c1 := child{

		// child struct can directly
		// access base struct variables
		person{
			name: "Amelia",
		},
		member{
			club: "MCS Liaison",
		},
	}

	// child struct can directly
	// access base struct methods

	// printing base method
	// using instance of child struct
	fmt.Println(c1.printPerson())
	fmt.Println(c1.printMember())
}
```	

## PLP 6 Final Coding Project Proposal
	The main idea is to make a "deluxe version" of sorts of the choose your own adventure game we made in CS112. There will be more paths with the player starting outside a cave. There will be a definitive destination the player has to go to. The program we wrote randomly chose caves for the player to interact with. 


	- Functions will be created to simulate each location a player goes to and the statements will clue the player into the challenge in each place
	- User Input will be used for actions or choosing which path to go
	- Data Structures - not sure which ones will be used, but could use a dictionary to keep track of inventory
	- Player object that has name attribute
	- GUIS in Go are only available with Go packages, will most likely be used to show inventory, health, coins, etc
	- The user can cancel at any time they want because the option will be a part of user input
	

	Functions 
	- attribute_location: There will be at least 10 different locations to go to on the path. Based on user input, a different function will be called.
	
	Objects
	- Player object: will have attributes name, inventory, health, and coins
	- Path object: will have attribute for location
	
	Variables
	- Inventory: array
	- Health: int
	- Coins: float
	- name: String
	- Path: location
	
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
  - https://www.geeksforgeeks.org/inheritance-in-golang/
  - http://changelog.ca/log/2015/01/30/golang
  - https://golangbot.com/structs/
  - https://go.dev/doc/
  - https://www.w3schools.com/go/index.php 
  - https://www.tutorialspoint.com/go/index.htm
  - https://www.w3schools.com/go/go_struct.php
  - https://www.geeksforgeeks.org/class-and-object-in-golang/
  - https://code.tutsplus.com/tutorials/lets-go-object-oriented-programming-in-golang--cms-26540
  - https://golangdocs.com/inheritance-in-golang



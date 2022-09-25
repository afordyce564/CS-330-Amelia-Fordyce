## Data Types

1. Does your language have keywords or reserved words? How many?  

	Go has reserved words. There are 25 reserved words.  


2. What are the naming requirements for variables in your language?  
What about naming conventions? Are those enforced by the compiler/interpreter, or just  standards in the community? 

	Variable names cannot start with a digit, but they can begin with a letter or an underscore. Variable names can include digits 1-10, letter a-z and A-Z. 	Names of variables are case sensitive. They cannot include reserved words. 
	
	You must declare variables with the var keyword. 


3. Is your language statically or dynamically typed? 
	
	Go variables are statically typed, which means that they have the type given to them by the declaration. They 

4. Strongly typed or weakly typed? 

	Go is strongly typed, which means that each type of data is predefined as part of the programming language. 

5. Explicitly typed or implicitly typed? 

	The language is implicitly typed because types are not required to be part of a variable’s declaration. 


6. Are some variables mutable while others are immutable? 
	Strings are the only variable type in this language that is immutable. 


7. What are the operators available for each data type?  




	binary_op  = "||" | "&&" | rel_op | add_op | mul_op .
	rel_op     = "==" | "!=" | "<" | "<=" | ">" | ">=" .
	add_op     = "+" | "-" | "|" | "^" .
	mul_op     = "*" | "/" | "%" | "<<" | ">>" | "&" | "&^" .

	unary_op   = "+" | "-" | "!" | "^" | "*" | "&" | "<-" .
	

8. Are mixed type operations allowed? If so, how are they accommodated? 


	Mixed type operations do not seem to be allowed.  


9. At what point are identifier names and operator symbols bound in your language? For example  if you declare a (variable, class name, function name), when is it bound to the type, address?  When are operators (+,*, etc.) bound to their operations?  

Identifier names and operator symbols are bound in Go when variables, classes, and functions are declared. You declare variables with the var keyword and the type is automatically bound. 
CODING EXAMPLE demonstrating the features above 
1 Adapted with permission from Dr. Amber Stubbs
EXAMPLE OF (one) ILLUSTRATIVE EXAMPLE:  
If you put this line (or something similar) in a program and try to print x, what does it do?  x = "5" + 6 

	
	You cannot compile that statement. You will get this error. 

	(mismatched types untyped string and untyped int)


If it doesn't compile, why? Is there something you can do to make it compile? 

	The above statement does not compile because the types are unmatched and the integer is untyped. 

	You can print the addition of 5 and 6 in a print statement. Inside the statement they are considered to be integers. 


10. Describe the limitations (or lack thereof) of your programming language as they relate to the  coding example portion of the assignment (adding ints and floats, storing different types in lists,  converting between data types). Are there other restrictions or pitfalls that the documentation  mentions that you need to be aware of? 
	
	Go is statically typed, which means that it will be less flexible than other languages. Converting strings to integers is more difficult than in other languages. You will have to import the strconv package and use the Atoi() function. For converting integers to strings, you have to use the Itoa() function. 


11. Are there built-in complex data types that are commonly used in your language? (hint: they’d  probably appear fairly early in the documentation if so) 

        Complex data types in Go are integers and floating point numbers.

### Sources
  - https://ado.xyz/blog/converting-strings-to-numbers-in-go/
  - https://go.dev/ref/spec
  - https://datafloq.com/read/go-language-benefits-limitations/
  - https://www.geeksforgeeks.org/go-variables/?ref=lbp
  - https://www.digitalocean.com/community/tutorials/how-to-do-math-in-go-with-operators
 

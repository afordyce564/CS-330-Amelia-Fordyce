package main

import (
	"fmt"
	"strings"
)

func main() {

	//Write (or try to emulate, if your language doesn’t have them) different kinds of loops: while, do/while, for, foreach
	fmt.Println("\nGo does not have a while, do/while or foreach loops. ")
	fmt.Println("Go only has a for loop.")

	var i = 1
	for i < 5 {
		fmt.Println("not 5")
		i++
	}

	fmt.Println("\nMultiply two numbers and spit them out")
	multiplyNums(8, 6)

	fmt.Println("\nSplit a sentence into two")
	splitIntoTwo("HelloWorld")
}

// Write a function that takes in two numbers, multiplies them, and returns the output
var a int = 8
var b int = 6

func multiplyNums(a int, b int) {
	var result int = a * b
	fmt.Println(result)
}

//Write a recursive function (one that calculates a factorial is fine)

// Write a function that takes in a string (or your language's equivalent) and splits it into two strings, then returns both strings
func splitIntoTwo(sentence string) {
	fmt.Println(strings.Split(sentence, ""))

}

//Call your functions and save the results of the function calls in variables.

//Write a function that tests whether your language is pass-by-reference or pass-by-value.

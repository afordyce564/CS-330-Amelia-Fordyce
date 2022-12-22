package main

import "fmt"

func main() {
	//var x = "5" + 6
	fmt.Println(5 + 6)

	//with declared variables
	var x = 5
	var y = 6

	fmt.Println(x + y)
	
	//you cannot make an array with multiple data types
	// you have to define the type
	var groceryList = []string{"hello", "world", "is", "good"}
	
	//Integers can be converted to other types of Integers, Floats, and Strings
	var litte int8
	
	big = int64(little)
	
	//Floats can be converted into Integers and Strings
	//For Floats to Ints, use the int() function
	int(4.0)
	
	//To convert Integers and Floats into Strings, you must import the strconv package and use the strconv.Itoa function
	twelve = strconv.Itoa(12)
}

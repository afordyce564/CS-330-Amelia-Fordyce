package main

import "fmt"

func main() {

	//Question 1: example of boolean values

	var t bool = true
	var f bool = false

	fmt.Println(t)
	fmt.Println(f)

	//Question 2: example of conditional statements
	if t != true {
		fmt.Println("weird")
	} else if f != false {
		fmt.Println("also weird")
	} else {
		fmt.Println("everything is okay!")
	}
	//Question 3: example of go delimiting selection control statements

	//Question 4: example of short-circuit evaluation in Go

	//Question 5: example of dangling else problem
	/*
		if (condition) {

		}
		if (condition_1){

		}
		if(condition_2){

		}
			else{

			}
	*/

	//Question 6: example of switch statement
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
}

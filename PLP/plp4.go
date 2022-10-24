package main

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

	//can print t outside of the function
	fmt.Println(t)

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
	var i = 1
	for i < 5 {
		fmt.Println("not 5")
		i++

	}
}

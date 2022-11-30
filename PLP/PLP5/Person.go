/*
 * Goal: Build a really good choose your own adventure game
 * One step at a time
 * Sources
	- https://www.w3schools.com/go/go_struct.php
	- https://www.geeksforgeeks.org/class-and-object-in-golang/
	https://code.tutsplus.com/tutorials/lets-go-object-oriented-programming-in-golang--cms-26540
	- https://golangdocs.com/inheritance-in-golang
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

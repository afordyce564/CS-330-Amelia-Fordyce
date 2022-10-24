package main

import "fmt"

//func Recursive(number int) int {

//	if number == 1 {

//		return number
//	}

//	return number + Recursive(number-1)
//}

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
	/*
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
	*/
	//while loop?
	var i = 1
	for i < 5 {
		fmt.Println("not 5")
		i++

		var s1 string = "I'm just like you, you're just like me"
		splitUp(s1)

	}
	/*
		//do-while loop?
		for {
			main()
			if !true {
				break
			}
		}
	*/

	//answer := Recursive(4)
	//fmt.Printf("Recursive: %d\n", answer)

	//recursive function

	//This code is from David Yappeter; his code is in the source list

	a, b := 0, 0

	// Initialize Value
	fmt.Printf("## INIT\n")
	fmt.Printf("Memory Location a: %p, b: %p\n", &a, &b)
	fmt.Printf("Value a: %d, b: %d\n", a, b) // 0 0

	// Passing By Value a(int)
	Add(a) // Golang will copy value of 'a' and insert it into argument

	// Passing By Reference b(int), &b(*int) => with '&' we can get the memory location of 'b'
	AddPtr(&b) // Pass Memory Location of 'b' into argument

	fmt.Printf("\n## FINAL\n")
	fmt.Printf("Memory Location a: %p, b: %p\n", &a, &b)
	fmt.Printf("Value a: %d, b: %d\n", a, b) // 0 1
}

// Pass By Value
func Add(x int) {
	fmt.Printf("\n## 'Add' Function\n")
	fmt.Printf("Before Add, Memory Location: %p, Value: %d\n", &x, x)
	x++
	fmt.Printf("After Add, Memory Location: %p, Value: %d\n", &x, x)
}

// Pass By Reference
func AddPtr(x *int) {
	fmt.Printf("\n## 'AddPtr' Function\n")
	fmt.Printf("Before AddPtr, Memory Location: %p, Value: %d\n", x, *x)
	*x++ // We add * in front of the variable because it is a pointer, * will call value of a pointer
	fmt.Printf("After AddPtr, Memory Location: %p, Value: %d\n", x, *x)
}

func splitUp(s1 string) {
	var first_half string = s1[0:17]
	var other_half string = s1[18:]
	fmt.Println(first_half)
	fmt.Println(other_half)
}

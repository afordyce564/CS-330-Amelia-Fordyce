/*
 * Goal: Build a really good choose your own adventure game
 * Sources
	- https://www.w3schools.com/go/go_struct.php
	- https://www.geeksforgeeks.org/class-and-object-in-golang/
	- https://code.tutsplus.com/tutorials/lets-go-object-oriented-programming-in-golang--cms-26540
	- https://go.dev/doc/faq
	- https://go.dev/doc/effective_go
	- https://www.geeksforgeeks.org/arrays-in-go/
	- https://medium.com/backendarmy/linked-lists-in-go-f7a7b27a03b9
	- https://www.developer.com/languages/linked-list-go/
	- https://www.geeksforgeeks.org/how-to-append-a-slice-in-golang/
	- https://tutorialedge.net/golang/go-linked-lists-tutorial/
*/

package main

import (
	"fmt"
)

// for player object
type Player struct {
	name string
	//make inventory an array of strings
	inventory []string
	health    int
	coins     int
}

// make a singly linked list for the path
// code from developer.com (I linked the source in the list above.)
// single location in path linked list
type Node struct {
	info interface{}
	next *Node
}

// path linked list
type Path struct {
	head *Node
}

// function to insert items into linked list
func (l *Path) Insert(d interface{}) {
	list := &Node{info: d, next: nil}
	if l.head == nil {
		l.head = list
	} else {
		p := l.head
		for p.next != nil {
			p = p.next
		}
		p.next = list
	}
}

// Display linked list
func Show(l *Path) {
	p := l.head
	for p != nil {
		fmt.Printf(" -> %v ", p.info)
		p = p.next
	}
}

// back to my code for a minute
func main() {

	var p Player
	var sl Path
	var playerName string
	var playerAge int

	fmt.Println("What is your name? ")
	fmt.Scanln(&playerName)

	fmt.Println("\nHow old are you?")
	fmt.Scanln(&playerAge)

	//player1 specifications
	p.name = playerName
	p.inventory = []string{}
	p.health = 100 + playerAge
	p.coins = 100

	toString(p)

	//call functions that make up the path
	//or the ones that require use of the object methods
	//for p.health > 0 {
	forestOrCave(p, sl)
	report(p, sl)

	//more developer.com code
	//create path linked list and insert whenever necessary
	sl = Path{}
	//for i := 0; i < 5; i++ {
	//}
	// call show function
	Show(&sl)

}

func toString(p Player) {
	fmt.Println("\nName: ", p.name)
	fmt.Println("Inventory: ", p.inventory)
	fmt.Println("Health: ", p.health)
	fmt.Println("Coins: ", p.coins)
}

// forestOrCave
// player chooses whether or not they go to a forest or a cave
func forestOrCave(p Player, sl Path) {
	//get input from player
	var input string
	fmt.Println("\nHello " + p.name + "!")
	fmt.Println("\nYou've been stranded by your party in a an open field. You remember that there's a town close by.")
	fmt.Println("You're standing in an open field populated by flowers. There's two paths in front of you: one leads you into a large forest, the other path leads you into a cave")
	fmt.Println("\nWhich path do you choose? (Answer with one word like forest or cave.) ")
	fmt.Scanln(&input)

	if input == "forest" {
		//fmt.Print("function call for Forest")
		forestOne(p, sl)
	}

	if input == "cave" {
		//fmt.Println("function call for Cave")
		caveOne(p, sl)
	}
}

// forest path
func forestOne(p Player, sl Path) {
	sl.Insert("forest")
	var input string
	fmt.Println("\nYou enter the forest. The field seems to vanish behind you as you enter a clearing. A sign points in two directions. One points you towards the falls. The other points you towards more of a stable path.")
	fmt.Println("\nWhich path do you choose? ")
	fmt.Scanln(&input)

	if input == "falls" {
		forestTwoFalls(p, sl)
	}
	if input == "stable" {
		forestTwoStable(p, sl)
	}
}

// step two
func forestTwoFalls(p Player, sl Path) {
	sl.Insert("falls")
	var input string
	fmt.Println("\nYou head towards the falls, there are two ways to get around there. A rickety bridge or incredibly steep stairs carved into the face of the hill.")
	fmt.Println("\nWhich path do you choose? ")
	fmt.Scanln(&input)
	if input == "bridge" {
		forestThreeBridge(p, sl)
	}
	if input == "stairs" {
		forestThreeStairs(p, sl)
	}
}

// step two
func forestTwoStable(p Player, sl Path) {
	sl.Insert("horse stable")
	var input string
	fmt.Println("\nTurns out the stable path leads to a horse stable. There is a horse there.")
	fmt.Println("\nDo you stay with the horse and take care of it or do you turn around? ")
	fmt.Scanln(&input)
	if input == "stay" {
		sl.Insert("stay with the horse")
		fmt.Println("\nYou stay with the horse and take care of it. You become so obsessed that you forget why you went to the forest in the first place.")
		fmt.Println("Inside the stable there are some coins and a secret tunnel. You remember your mission.")
		fmt.Println("\nDo you go inside the tunnel or stay longer with the horse?")
		fmt.Scanln(&input)
		if input == "tunnel" {
			sl.Insert("tunnel")
			fmt.Println("\nThe tunnel is dark and cold, but not long.")
			fmt.Println("It spits you out on a hill that looks over the town. There is a sizeable rope on the ground.")
			forestFourGrapple(p, sl)
		}
		if input == "stay" {
			sl.Insert("stay with the horse for longer")
			fmt.Println("\nYou stay with the horse for the rest of your life, which lasts about a few days because you die of starvation. Turns out the horse is bait to lure people in and give them curses. The end")
			//subtract life away
			p.health = 0
			//add a want to play again thing? or something else
			//return p.health
		}
	}
	if input == "turn" {
		sl.Insert("turn around")
		forestOne(p, sl)
	}

}

func forestThreeStairs(p Player, sl Path) {
	sl.Insert("stairs")
	var input string
	fmt.Println("\nYou turn aroud and look down a set of steep stairs")
	fmt.Println("You carefully go down each step, trying not to fall")
	fmt.Println("You get to the bottom and you are relieved that you did not have to go up the stairs.")
	fmt.Println("Ahead, you see a garden. Then, you see a flash of pink light and see it floating in front of your eyes.")
	fmt.Println("Do you go to the garden or follow the pink light?")
	fmt.Scanln(&input)

	if input == "garden" {
		forestFourGarden(p, sl)
	}
	if input == "follow" {
		forestFourFairy(p, sl)
	}
}

func forestThreeBridge(p Player, sl Path) {
	sl.Insert("bridge")
	var input string
	fmt.Println("\nYou attempt to walk on the bridge. It makes you nervous and you wobble around. If you have any coins some of them fall out of your pocket. ")
	fmt.Println("After some near-death moments, you make it over with your life intact. The falls are beautiful")
	fmt.Println("You begin to see the town from the distance. There two ways you can go from here. You see a vegetable garden and a rope on the ground.")
	fmt.Println("\nDo you walk towards the garden or grapple down the mountain? ")
	fmt.Scanln(&input)
	//lose 10 health points
	//lose coins if player has some
	if p.coins >= 50 {
		p.coins = p.coins - 30
	}
	if input == "garden" {
		forestFourGarden(p, sl)
	}
	if input == "grapple" {
		forestFourGrapple(p, sl)
	}
}

func forestFourGarden(p Player, sl Path) {
	sl.Insert("garden")
	var input string
	fmt.Println("\nYou walk through the garden, trying not to trample on the lovely vegetables growing there.")
	fmt.Println("You pick up a squash for fun.")
	//add squash to inventory
	res1 := append(p.inventory, "squash")
	fmt.Println("\nInventory: ", res1)

	fmt.Println("You walk a few more steps when you hear a farmer yelling at you. Uh oh.")
	fmt.Println("\nDo you run, or do you confront the farmer? ")
	fmt.Scanln(&input)
	if input == "run" {
		forestFiveRun(p, sl)
	}
	if input == "confront" {
		forestFiveConfront(p, sl)
	}
}

func forestFourFairy(p Player, sl Path) {
	sl.Insert("follow the fairy")
	var input string
	fmt.Println("\nYou follow the pink light to a grove where there are more pink, blue, green, and purple lights.")
	fmt.Println("One lands in your hand and you stash it away because fairies are cool.")
	//add fairy to inventory
	res1 := append(p.inventory, "fairy")
	fmt.Println("\nInventory: ", res1)

	fmt.Println("The fairies whisper in your ear. They ask you to join them in their hollow.")
	fmt.Println("\nDo you accept, or do you refuse? ")
	fmt.Scanln(&input)
	if input == "accept" {
		sl.Insert("accept fairies offer")
		fmt.Println("The fairies take you in. They feed you and when you explain your situation to them, they are understanding.")
		fmt.Println("They give you some fairy dust as a gift.")
		res1 := append(p.inventory, "fairy dust")
		fmt.Println("\nInventory: ", res1)

	}
	if input == "refuse" {
		sl.Insert("refuse fairies")
		fmt.Println("The fairies become angry, especially when they find out you took one of their own.")
		fmt.Println("They turn you into dust. You feel your bones disintegrate. You die.")
		p.health = 0
	}
}

func forestFiveRun(p Player, sl Path) {
	sl.Insert("run from the farmer")
	fmt.Println("\nYou run as fast as you can from the farmer. You look behind you and don't see him.")
	fmt.Println("The city gates are closer than you thought. ")
	fmt.Println("In all your excitement, you drop your squash")
	//subtract squash from inventory
	forestFiveGuard(p, sl)
}

func forestFiveConfront(p Player, sl Path) {
	sl.Insert("confront the farmer")
	fmt.Println("\nYou get on your knees and beg to keep the one squash you stole, which would be your only meal for the day.")
	fmt.Println("The farmer lets you keep the squash, but on the promise that you have to work until nightfall. Only then can you leave.")
	fmt.Println("When you finish work, the glow of the city guides you to the gates.")
	forestFiveGuard(p, sl)
}

func forestFourGrapple(p Player, sl Path) {
	sl.Insert("grapple mountain with rope")
	var input string
	//add rope to player's inventory
	res1 := append(p.inventory, "rope")
	fmt.Println("Inventory: ", res1)

	fmt.Println("\nYou tie the rope around a tree stump, knot it, and hold on for your life.")
	fmt.Println("You manage to make it down the mountain, you hit your leg a few times on the way down.")
	//subtract player health points
	fmt.Println("There's a problem with your plan. The rope is not long enough to haul you safely to the ground.")
	fmt.Println("\nYou can try to climb your way down with your hands or drop down and hope for the best. ")
	fmt.Scanln(&input)
	if input == "climb" {
		sl.Insert("climb the rest of the mountain")
		fmt.Println("\nYou slowly remove your hands from the ropes and onto the edges of the cliff")
		fmt.Println("Your hand slips from the rock and suddenly you lose your grip and are hanging on. You try your best to recover, but you fall and get hurt")
		//subtract health
		forestFiveGuard(p, sl)

	}
	if input == "drop" {
		sl.Insert("drop down")
		fmt.Println("\nYou decide to raw-dog it and drop down.")
		fmt.Println("...")
		fmt.Println("You die, what did you expect?")
		//make health 0
		p.health = 0
	}
}

func forestFiveGuard(p Player, sl Path) {
	sl.Insert("meet with guard")
	var input string
	fmt.Println("\nThe town is close now. You walk towards the gates. The guards positioned there block you from entering the town. They point their spears at you while the captain speaks to you.")
	fmt.Println("\"Greetings traveler. What is your business in this city?\"")
	//dialogue yada yada
	fmt.Println("\nDo you distract the guard or talk to him? ")
	fmt.Scanln(&input)

	if input == "distract" {
		forestSixDistract(p, sl)
	}
	if input == "talk" {
		forestSixTalk(p, sl)
	}
}

func forestSixDistract(p Player, sl Path) {
	sl.Insert("distract guard")
	fmt.Println("\nYou yell \"Look at that big monster!\" and sneak under the captain's arm. You feel a spear tear into your side.")
	//lose like 50 points of health
	p.health = p.health - 50
	fmt.Println("You are injured, but you figure that if you make it to the inn you can get it patched up.")
	fmt.Println("You stumble towards nearest inn. You figured that the rest of the party would be in there too.")
	success(p, sl)
}

func forestSixTalk(p Player, sl Path) {
	sl.Insert("talk to guard")
	fmt.Println("\nYou tell the captain about your situation. He thinks for a moment then steps aside and lets you in.")
	success(p, sl)
}

//cave path

func caveOne(p Player, sl Path) {
	sl.Insert("cave")
	var input string
	fmt.Println("\nYou trudge into the cave, not expecting much, but there seems to be multiple ways to go. Knowing how to navigate above ground, you feel mildly confident about this.")
	fmt.Println("There is a big hole on your left and one in front of you. The left is pitch black, but the hole in front of you is lit. A lantern sits near the entrance of the cave.")
	fmt.Println("\nWhich one will you choose? ")
	fmt.Scanln(&input)
	if input == "left" {
		caveTwoLeft(p, sl)
	}
	if input == "front" {
		caveTwoFront(p, sl)
	}

}

func caveTwoLeft(p Player, sl Path) {
	sl.Insert("left")
	var input string
	//add lantern to inventory
	res1 := append(p.inventory, "lantern")
	fmt.Println("Inventory: ", res1)
	fmt.Println("The hole is incredibly dark, but you pick up the lantern from the entrance of the cave.")
	fmt.Println("You walk for a while but there's no sign of life, apart from a few bugs.")
	fmt.Println("While you think, you trip over something hard and made of metal. It's a hatchdoor with a metal handle")
	fmt.Println("\nDo you want to keep going forward, or would you rather open the hatchdoor? ")
	fmt.Scanln(&input)
	if input == "forward" {
		caveThreeForward(p, sl)
	}
	if input == "hatchdoor" {
		caveThreeHatchdoor(p, sl)
	}
}

func caveTwoFront(p Player, sl Path) {
	sl.Insert("path in front")
	var input string
	fmt.Println("\nYou enter the brightly lit path in front of you. You hear whispers from a room nearby and you pause to hear what they say.")
	fmt.Println("It's a group of moles.")
	fmt.Println("\"How dare you intrude on our meeting?\" one of them screeches. There's a hole behind the chair where that mole sits. You could also turn around.")
	fmt.Scanln(&input)

	if input == "hole" {
		caveThreeHole(p, sl)
	}
	if input == "turn around" {
		caveOne(p, sl)
	}

}

func caveThreeForward(p Player, sl Path) {
	sl.Insert("going forward in cave")
	var input string
	fmt.Println("\nGoing forward means more darkness, and you sense the lantern is going to run out of light soon.")
	fmt.Println("After a few moments, you start looking around for anything that would keep your lantern going.")
	fmt.Println("Fortunately you find a small piece of coal on the ground. There's also a few dry twigs.")
	fmt.Println("\nWhich material do you choose to keep yourself going? ")
	fmt.Scanln(&input)
	if input == "coal" {
		//add coal to inventory
		res1 := append(p.inventory, "coal")
		fmt.Println("Inventory: ", res1)
		fmt.Println("\nYou put the coal into the lantern, which makes it burn bright.")
		fmt.Println("With your prolonged light, you take your time exploring the hole.")
		fmt.Println("After a while, you find a wall with light seeping through the cracks.")
		fmt.Println("You dig through it with your fingers, scraping them in the process.")
		//lose health
		fmt.Println("\nYou've found a quaint vegatable garden.")
		forestFourGarden(p, sl)
	}
	if input == "twigs" {
		//add twigs to inventory
		res1 := append(p.inventory, "twigs")
		fmt.Println("Inventory: ", res1)
		fmt.Println("\nYou snap the twigs and place them inside the lantern.")
		fmt.Println("They burn up quickly but you manage to find a wall with light seeping through the cracks.")
		fmt.Println("You dig through it with your fingers, scraping them in the process.")
		fmt.Println("\nYou've found a quaint vegatable garden.")
		//lose health
		//call garden function because it's the same path
		forestFourGarden(p, sl)
	}

}

func caveThreeHatchdoor(p Player, sl Path) {
	sl.Insert("open hatchdoor")
	var input string
	fmt.Println("\nYou open the hatchdoor and see the faces of what seems to be a mole family's home.")
	fmt.Println("...")
	fmt.Println("The mother invites you to come sit with them at the dinner table.")
	fmt.Println("\nDo you join them or refuse? ")
	fmt.Scanln(&input)

	if input == "join" {
		sl.Insert("join moles")
		fmt.Println("\nYou eat with the moles and feel satisfied. They offer you a bed in their guest room. The bed is small but you rest well and leave the following morning.")
		//replenish health points
		fmt.Println("You decide to leave through where you came.")
		fmt.Println("You decide to go down the path where you were walking before.")
		caveThreeForward(p, sl)
	}
	if input == "refuse" {
		sl.Insert("refuse moles")
		fmt.Println("You refuse, saying that you need to be somewhere. They look disappointed but give you a meal to go. You feel bad.")
		//add meal to inventory
		res1 := append(p.inventory, "delicious meal")
		fmt.Println("Inventory: ", res1)
		fmt.Println("You decide to go down the path where you were walking before.")
		caveThreeForward(p, sl)
	}
}

func caveThreeHole(p Player, sl Path) {
	sl.Insert("hole")
	var input string
	fmt.Println("\nYou get onto your knees and crawl behind the moles sitting at the table. They can feel your vibrations. One of them pushes their chair into you.")
	//subtract health
	if p.health >= 50 {
		p.health = p.health - 45
	}
	fmt.Println("You try not to yelp as you slowly move towards the hole.")
	fmt.Println("Once you enter the hole, there are two doors: one in front of you and one on the side.")
	fmt.Println("\nDo you go in the front or side door? ")
	fmt.Scanln(&input)
	if input == "front/sdoor" {
		fmt.Println("You open the door to find yourself in a fairy hollow. A pink light buzzes around your face and you are entranced by it.")
		forestFourFairy(p, sl)
	}
	if input == "side/sdoor" {
		fmt.Println("The side door opens to a burst of light. Turns out you landed right in front of the town's entrance.")
		forestFiveGuard(p, sl)
	}
}

// this is called at the end of each terminal function of each path that warrants a success
func success(p Player, sl Path) {
	sl.Insert("found the party")
	fmt.Println("\nYou walk into the tavern and spot the familiar faces of your party. Congratulations! You've made it back safely to your party.")
}

func report(p Player, sl Path) {
	//report all stats
	fmt.Println("\nThese are your stats")
	fmt.Println("Inventory: ", p.inventory)
	fmt.Println("Health: ", p.health)
	fmt.Println("Coins: ", p.coins)
	fmt.Print("Path")
	Show(&sl)
}

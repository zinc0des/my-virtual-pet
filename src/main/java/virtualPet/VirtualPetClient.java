package virtualPet;

import java.util.Scanner;

public class VirtualPetClient {

	
	public static void main(String[] args) {
		VirtualPet myPet = new VirtualPet("Marty the Sloth");
		
		while(myPet.isAlive()) {
		print("Welcome to the world of Marty the Sloth.\n What do you want to do?");
		//print("Current Age of Marty the Sloth: " + myPet.getAge());
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		while ((userInput < 1) && (userInput < 5)) {
			print("1: Feed Marty");
			print("2: Water Marty");
			print("3: Put Marty to sleep");
			print("4: Play with Marty");
			print("5: Quit the game!");
			userInput = input.nextInt();
			}
		switch (userInput) {
		case 1: 
				System.out.println("Feeding Marty!");
				myPet.feed();
				System.out.println("Marty Fed!");
				break;
		case 2: myPet.water();
				System.out.println("Gave Marty fresh water to drink!");
				break;
		case 3: myPet.makeSleep();
				System.out.println("Put Marty to sleep!");
				break;
		case 4:	myPet.playWith();
				System.out.println("Played with Marty! Oh what fun it was to see him hanging on a tree!");
				break;
		case 5: System.out.println("Exiting Game!!!!");
				System.exit(0);
				break;
		default: System.out.println("Please enter a valid option between 1 and 5");
				break;
		}
				                                                                                                         	
	}
		System.out.println("Bless the soul of poor Marty the Sloth!");
		System.out.println("Thank you for playing!");
		
}
	private static void print(String message) {
		System.out.println(message);	
	}
}

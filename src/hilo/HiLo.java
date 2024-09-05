package hilo;

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		System.out.println("Let's play a guessing game! Pick a number from 1-20,\nYou only get 5 try to guess correctly,\nIf you guess correctly you Win! ");
		
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int) Math.random() * (20 + 1);
		int guess;	
		int n;
		boolean keepGoing = true;
		
		while (keepGoing) {
			for (n = 0; n < 5; n++) {
				System.out.println("Enter a number between 1-20 ");
				guess = sc.nextInt();
				
				if (randomNumber == guess){ 
					System.out.println("Good Job you gueesed correctly");
					break;
					
				}
				
				if(guess <= randomNumber) {
					System.out.println("Sorry, try again, your guess to low");	
				}
				else if(guess >= randomNumber) {
					System.out.println("Sorry, try again, your guess to high");	
				}
				
			}
			if (n == 5) {
				System.out.println("You lose! The random number was "+ randomNumber);
			}
			System.out.println("Would you like to play again?");
			String answer = sc.next();
			if (answer.equals("yes")) {
				randomNumber = (int) Math.random() * (20 + 1);
			
			} else {
				System.out.println("Thanks for playing. Goodbye! ");
				keepGoing = false;
			} 
		}
		sc.close();
	}
}
